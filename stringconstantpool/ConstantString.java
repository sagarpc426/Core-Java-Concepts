package stringconstantpool;

public class ConstantString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Strings are not mutable
		// stored in String Constant Pool - addresses are same
		String s1 = "Sagar";	// First class object
		String s2 = "Sagar";
		if(s1==s2)
			System.out.println("s1 and s2 addresses are same ");
		else
			System.out.println("s1 and s2 addresses are not same ");
		
		
		if(s1.equals(s2))
			System.out.println("s1 and s2 values are same ");
		else
			System.out.println("s1 and s2 values are not same ");
		
		// stored in heap memory - addresses are not same		
		String str1 = new String("Chaudhari");
		String str2 = new String("Chaudhari");
		
		if(str1==str2)
			System.out.println("str1 and str2 addresses are same ");
		else
			System.out.println("str1 and str2 addresses are not same ");
		
		
		if(str1.equals(str2))
			System.out.println("str1 and str2 values are same ");
		else
			System.out.println("str1 and str2 values are not same ");
		
 	}

}
