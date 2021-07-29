package p5;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


public class ThreeBallDemo extends Frame implements Runnable 
{
	int x1=100,y1=50,x2=100,y2=150,x3=100,y3=250;

	Thread t1,t2,t3; //contained Object
	
	
	public ThreeBallDemo() {
	
		t1=new Thread(this,"First");
		t2=new Thread(this,"Second");
		t3=new Thread(this,"Third");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void paint(Graphics g) {
	
		g.setColor(Color.RED);
		g.fillOval(x1, y1,40,40);
		
		g.setColor(Color.BLUE);
		g.fillOval(x2, y2,40,40);
		
		g.setColor(Color.GREEN);
		g.fillOval(x3, y3,40,40);
	
	}
	public void run() {
		
		int z=1;
		try
		{
		while(z<=500)
		{
			if(Thread.currentThread()==t1)
			{
				if(z==300)
				{
					synchronized (this) 
					{
						wait();
					}
					
				}
				
				x1++;				
				Thread.sleep(20);
				
			}
			
			if(Thread.currentThread()==t2)
			{
				if(z==300)
				{
					synchronized (this) 
					{
						wait();
					}
					
				}
				x2++;
				Thread.sleep(20);
			}
			if(Thread.currentThread()==t3)
			{
				if(z==300)
				{
					synchronized (this) 
					{
						notifyAll();
					}
					
				}
				x3++;
				Thread.sleep(40);
			}
			
			
			z++;
			repaint();
		}
		
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args)
	{
		ThreeBallDemo d=new ThreeBallDemo();
		d.setVisible(true);
		d.setSize(800,800);
	}


}
