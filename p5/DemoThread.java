package p5;

/*
 * to assign name to a thread
 *  1. use setName() method
 *  2. use constructor
 * 
 * 
 * 
 */

public class DemoThread extends Thread
{
	
	public DemoThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++)
			{
				if(Thread.currentThread().getName().equals("ping"))
				{
					Thread.sleep(500);
					System.out.println("Hiiiiii  from "+Thread.currentThread().getName());
				}
				if(Thread.currentThread().getName().equals("pong"))
				{
					Thread.sleep(1000);
					System.out.println("Bye from "+Thread.currentThread().getName());
				}
			}		
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {

		DemoThread d1=new DemoThread("ping");
		d1.start(); // register the thread
	

		DemoThread d2=new DemoThread("pong");
		d2.start(); // register the thread
	

	}
}
