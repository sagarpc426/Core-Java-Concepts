package p1;

public class Test {

	public static void main(String[] args) {
		
		Account obj=new Account(10000);
		
		Transaction t1=new Transaction("Ram", obj);
		Transaction t2=new Transaction("Shyam",obj);
		
		t1.start();
		t2.start();
		
	}
}
