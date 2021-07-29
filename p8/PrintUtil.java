package p8;

import java.util.ArrayList;

public class PrintUtil {

	public static void printProduct(ArrayList l5)
	{
		for(Object ob:l5)
		{
			Product p=(Product)ob;			
			//System.out.println(p.name);
			System.out.println(p);
		}
	}
}
