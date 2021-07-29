package assignments;

public class IceCream extends DessertItem {
	double cost;
	public IceCream() {
		
	}
	public IceCream(String name, int calories, double cost) {
		super(name, calories);
		this.cost = cost;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
	public String toString() {
		return super.toString()+", Cost: "+cost; 
	}
}
