package bank;

public class ATM {
	private double balance;
	public ATM(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "ATM balance=" + balance;
	}
	
}
