package MultiThreading;



/*
 * to assign name to a thread
 *  1. use setName() method
 *  2. use constructor
 * 
 * 
 * 
 */

public class Demo extends Thread
{
	
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
	
	
	/*public void run()
	{
		try
		{
			for(int i=1;i<=20;i++)
			{
				if(Thread.currentThread().getName().equals("Thread-0"))
				{
					Thread.sleep(500);
					System.out.println("Hiiiiii  from "+Thread.currentThread().getName());
				}
				if(Thread.currentThread().getName().equals("Thread-1"))
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
	}*/


	public static void main(String[] args) {

		Demo d1=new Demo();
		d1.start(); // register the thread
		d1.setName("ping");

		Demo d2=new Demo();
		d2.start(); // register the thread
		d2.setName("pong");

	}
}
