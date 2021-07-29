package assignments;

public class Sundae extends IceCream {
	double topping;
	
	public Sundae(){
		super();
	}
	public Sundae(double cost, double topping, int calories) {
		super("Sundae IceCream", calories, cost);
		this.topping = topping;
	}
	
	public double getCost() {
		return super.getCost()+topping;
	}
	public String toString() {
		return super.toString()+", Topping: "+topping;
	}
}
