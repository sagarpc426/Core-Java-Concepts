package innerclass;

public class BankAccount {

	// inner class -  class inside a class
	// types - i. simple inner class
	//		  ii. static inner
	// 		 iii. method local inner class
	//		  iv. anonymous inner class
	// it is used to show the dependency of a class
	// example - if any user want to open locker from bank, 
	// to open a locker user must have an account in the bank
	
	private int accno;
	private String name;
	public BankAccount() {
		accno = 0011;
		name = "John";
	}
	public void show() {
		System.out.println("Accno: "+accno+" Name: "+name);
	}
	
	class Locker  // simple inner class
	{
		int lockerno;
		public Locker() {
			lockerno = 5432;
		}
		public void showLocker() {
			System.out.println("Accno: "+accno+" Name: "+name);
			System.out.println("Locker Number= "+lockerno);
		}
	}
	
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		Locker l = b1.new Locker();
		l.showLocker();
	}
	
}
