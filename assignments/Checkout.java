package assignments;

import java.util.ArrayList;

//import java.util.Scanner;

public class Checkout {

	float tax = 0.05f;
	double totalCost = 0;
	
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	
	// wildcard ArrayList
	public double calBill(ArrayList<?> d, int n) {
		for(Object ob:d) {
			//totalCost += d.getCost();
			DessertItem d1 = (DessertItem)ob;
			totalCost += d1.getCost();
		}
		return Math.round(totalCost);
	}
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int choice;
		ArrayList<DessertItem> d = new ArrayList<DessertItem>();
		System.out.println("<-------< Dessert Shoppe >-------->");
		
		d.add( new Candy("Chocolate Candy",10,10,45));
		d.add( new IceCream("Butter Scotch IceCream",60,50));
		d.add(new Cookie("Dry Fruit Cookie",5,10,89));
		d.add(new Sundae(50,5,78));
		
//		System.out.println("\nCandy Details - "+d[0]);
//		System.out.println("\nIceCream Details - "+d[1]);
//		System.out.println("\nCookie Details - "+d[2]);
//		System.out.println("\nIceCream Details - "+d[3]);
		
		for(Object ob:d) {
			System.out.println(ob);
		}
		Checkout ch = new Checkout();
		double bill = ch.calBill(d,4);
		System.out.println("\n\nTotal (Exclusive of tax) = "+bill);
		System.out.println("Tax (5%)                 = "+Math.round(bill*ch.getTax()));
		bill = bill + Math.round( ( bill * ch.getTax() ) );
		System.out.println("---------------------------------");
		System.out.println("Total (Inclusive of tax) = "+bill);
		
	}

}
