package arraylist;
import java.util.*;
public class PrintUtil {
	public static void PrintUtility(ArrayList l1) {
		
		for(Object ob:l1) {
			Employee e1 = (Employee)ob;
			System.out.println(e1);
		}
	}
}
