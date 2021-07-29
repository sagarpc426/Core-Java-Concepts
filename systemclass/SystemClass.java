package systemclass;

import java.util.Scanner;

public class SystemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System -> predefined class in Java
		// three attributes -> 
		//		i. in -> standard input stream
		//	   ii. out -> standard PrintStream
		//	  iii. err -> standard PrintStream
		System.out.println("John");
		System.err.println("You are in danger.....!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println(a);
	}

}
