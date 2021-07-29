package p5;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


public class DemoUI extends Frame implements Runnable 
{
	Thread t1,t2;
	int x1=100,y1=100,x2=400,y2=100;

	public DemoUI() {

		t1=new Thread(this,"pinkth");
		t2=new Thread(this,"greenth");		
		t1.start();
		t2.start();

		setVisible(true);
		setSize(500, 500);
	}	

	public void paint(Graphics g) {

		g.setColor(Color.pink);
		g.fillOval(x1, y1, 50, 50);

		g.setColor(Color.green);
		g.fillOval(x2, y2, 50, 50);

	}
	public void run() {

		try
		{

			for(int k=1;k<=300;k++)
			{

				if(Thread.currentThread()==t1)
				{
					Thread.sleep(20);
					x1++;
				}

				if(Thread.currentThread()==t2)
				{
					Thread.sleep(20);
					x2--;
				}


				repaint();

			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new DemoUI();

	}


}
