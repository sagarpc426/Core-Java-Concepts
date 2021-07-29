package assignments;

public class Cookie extends DessertItem {

	int number;
	double price;
	
	public Cookie() {
		
	}
	public Cookie(String name, int number, double price, int calories) {
		super(name, calories);
		this.number = number;
		this.price = price;
	}
	@Override
	public double getCost() {
		return Math.round(number*price);
	}
	
	public String toString() {
		return super.toString()+", Number: "+number+", Price: "+price;
	}
}
