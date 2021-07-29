package assignments;

public abstract class DessertItem {
	protected String name;
	protected int calories;
	public DessertItem(){
		
	}
	
	public DessertItem(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public abstract double getCost();
	
	public String toString() {
		return "Name: "+name+", Calories: "+calories;
	}
}
