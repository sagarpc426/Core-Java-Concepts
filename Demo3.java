

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f1=new File("d:\\info123.txt");
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();			
			System.out.println(s);
		}
		
	}
}
