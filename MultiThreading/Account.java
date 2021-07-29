package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

	Lock Lobj=new ReentrantLock();

	private int balance;
	public Account() {
		balance=5000;
	}
	public Account(int bal)
	{
		balance=bal;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public String toString() {

		return "Balance  = "+balance;
	}


}

//container class
class Transaction extends Thread
{
	Account aob;//contained Object

	public Transaction()
	{

	}
	public Transaction(String name,Account a)
	{
		super(name);//assign name to thread
		aob=a;
	}


	public  void withdraw(int amount)
	{

		aob.Lobj.lock();
		int b=aob.getBalance();
		System.out.println("***** Balance Before Withdraw "+b);
		b=b-amount;
		aob.setBalance(b);
		System.out.println("***** Balance After Withdraw "+b);
		aob.Lobj.unlock();

	}
	public  void deposit(int amount)
	{
		aob.Lobj.lock();
		int b=aob.getBalance();
		System.out.println("***** Balance Before deposit "+b);
		b=b+amount;
		aob.setBalance(b);
		System.out.println("***** Balance After deposit "+b);
		aob.Lobj.unlock();
	}
	public void run() 
	{

		if(Thread.currentThread().getName().equals("Ram"))
			deposit(2000);
		if(Thread.currentThread().getName().equals("Shyam"))
			withdraw(1000);

	}


}



