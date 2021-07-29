package stringconstantpool;

import java.util.Scanner;

public class string_assignment {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings: ");
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println("String1 = " + s1);
		System.out.println("String2 = " + s2);
		int choice;
		do {
		System.out.println(
				"1. Compare Strings (Case Sensitive)\n2. Get character\n3. Compare (Ignore Case)\n4. Concat\n5. Index of first occurance");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			if (s1.compareTo(s2) == 0)
				System.out.println("Strings are Equal");
			else
				System.out.println("Strings are not Equal");
			break;

		case 2:
			System.out.println("Enter index to get character from String1: ");
			int i = sc.nextInt();
			try {
				System.out.println(s1.charAt(i - 1));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Index out of range");
			}
			break;
		
		case 3:
			if (s1.compareToIgnoreCase(s2) == 0)
				System.out.println("Strings are Equal");
			else
				System.out.println("Strings are not Equal");
			break;
		
		case 4:
			System.out.println(s1.concat(s2));
			break;
			
		case 5:
			System.out.println("Enter character/string: ");
			String str = sc.next();
			if (s1.indexOf(str) == -1)
				System.out.println("Not found");
			else
				System.out.println(s1.indexOf(str)+1);
			break;
		}
		System.out.println("Enter 1 to continue: ");
		choice = sc.nextInt();
		} while(choice == 1);
	}

}
