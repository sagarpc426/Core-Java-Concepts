package innerclass;

public class StaticInner {

	static int side = 10;
	
	// static inner class
	static class Square{
		public void area() {
			System.out.println("Area of Square: "+side*side);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticInner s1 = new StaticInner();
		Square s = new Square();
		s.area();
	}

}
