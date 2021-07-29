package assignments;

public class Candy extends DessertItem {
	float weight;
	double price;
	public Candy() {
		
	}
	public Candy(String name,float weight, double price, int calories) {
		super(name, calories);
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public double getCost() {
		return Math.round(weight*price);
	}
	public String toString() {
		return super.toString()+", Weight: "+weight+", Price: "+price;
	}
}
