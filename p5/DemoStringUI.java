package p5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;


public class DemoStringUI extends Frame implements Runnable 
{
	Thread t1,t2;
	int x1=100,y1=100,x2=600,y2=100;

	public DemoStringUI() {

		t1=new Thread(this,"redth1");
		t2=new Thread(this,"redth2");		
		t1.start();
		t2.start();

		setVisible(true);
		setSize(700, 500);
	}	

	public void paint(Graphics g) {

		g.setFont(new Font("Arial",Font.ITALIC,20));
		g.setColor(Color.red);
		g.drawString("good", x1, y1);

		g.setColor(Color.red);
		g.drawString("morning", x2, y2);

	}
	public void run() {

		try
		{

			for(int k=1;k<=228;k++)
			{

				if(Thread.currentThread()==t1)
				{
					Thread.sleep(10);
					x1++;
				}

				if(Thread.currentThread()==t2)
				{
					Thread.sleep(10);
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

		new DemoStringUI();

	}


}
