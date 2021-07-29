package innerclass;

public class Restaurant {
	
	private String name;
	public Restaurant() {
		name = "Taj";
	}
	public void orderFood() {
		// method local /inner class
		class Bill{
			double amount;
			public Bill(){
				amount = 500;
			}
			public void genBill() {
				System.out.println("Restaurant="+name+" Amount="+amount);
			}
		}
		Bill b1 = new Bill();
		b1.genBill();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r = new Restaurant();
		r.orderFood();
	}

}
