package wrapper;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// all classes are final -> cannot be inherited
		// primitive types  - int, float, double, long, short
		// classes -> Integer, Float, Double
		// convert primitive to object -> to do that 
		// we are provided with wrapper classes with 1st letter capital
		// conversion from primitive to class is called as boxing
		// in Java 5 onwards we do not need to use constructor for converting -
		//	primitive to class obj
		
		
		int a = 10;  // primitive value
		Integer x = new Integer(a); // primitive to wrapper class -> boxing
		Integer b = a; 				// without constructor -> auto boxing
		
		System.out.println(a+" "+x);
		
	}

}
