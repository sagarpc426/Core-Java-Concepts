package p6;

//The join() method waits for a thread to die.
//In other words,it causes the currently running threads 
//to stop executing until the thread it joins with completes its task.


public class  TestJoinMethod1 extends Thread{ 
	TestJoinMethod1(String nm)
	{
		super(nm);
	}
	public void run(){  
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(50);  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}  
			System.out.println(Thread.currentThread().getName()+" "+i);  
		}  
	}  
	public static void main(String args[]){  
		TestJoinMethod1 t1=new TestJoinMethod1("th1");  
		TestJoinMethod1 t2=new TestJoinMethod1("th2");  
		TestJoinMethod1 t3=new TestJoinMethod1("th3");  
		t1.start();  
		try{  

     		//t1.join();
			t1.join(100);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}  

		t2.start();  
		t3.start();  
	}  
}  




/*

class MyThread extends Thread
{
    public void run()
    {
        for (int i=0; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()
                                + " in control");
    }
}

//The yield() method of thread class causes the currently executing thread object to temporarily pause and allow other threads to execute.	
public class yieldDemo
{
    public static void main(String[]args)
    {
        MyThread t = new MyThread();
        t.start();

        for (int i=0; i<5; i++)
        {
            // Control passes to child thread
            Thread.yield();

            // After execution of child Thread
            // main thread takes over
            System.out.println(Thread.currentThread().getName()
                                + " in control");
        }
    }
}
 */
