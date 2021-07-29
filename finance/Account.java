package finance;

public class Account {
	
	protected int accNo;
	protected String name;
	public Account(int accNo, String name) {   
		this.accNo = accNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "AccountNo = " + accNo + ", Name = " + name;
	}
}
