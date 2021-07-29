package MultiThreading;

public class MultiThreading extends Thread{

	@Override
	public void run() {
		System.out.println("Sagar Chaudhari");
	}
	public static void main(String[] args) {
		MultiThreading t1 = new MultiThreading();
		t1.start();
		MultiThreading t2 = new MultiThreading();
		t2.start();
	}
}
