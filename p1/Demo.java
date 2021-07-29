package p1;

public class Demo extends Thread 
{

	public Demo(String name)
	{
		super(name);
	}

	@Override
	public void run() 
	{
		try
		{
			for(int i=1;i<=50;i++)
			{
				if(Thread.currentThread().getName().equals("th1"))
				{
					System.out.println("Hiiii from "+Thread.currentThread().getName());
					Thread.sleep(120);
				}
				if(Thread.currentThread().getName().equals("th2"))
				{
					System.out.println("Bye from "+Thread.currentThread().getName());
					Thread.sleep(120);
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {

		Demo t1=new Demo("th1");
		t1.start();
		Demo t2=new Demo("th2");
		t2.start();
		//t1.setName("th1"); //thread-0
	}

}
