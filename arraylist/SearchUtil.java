package arraylist;
import java.util.*;

public class SearchUtil {
	public static void SearchUtility(ArrayList a1, String name) {
		int flag =0;
		for(Object ob:a1) {
			Employee e1 = (Employee) ob;
			if(e1.name == name) {
				System.out.println(name+" present in the list");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Name not found");
	}
	
	public static void SearchUtility(ArrayList a1, int id) {
		int flag =0;
		for(Object ob:a1) {
			Employee e1 = (Employee) ob;
			if(e1.eid == id) {
				System.out.println(id+" present in the list");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Eid not found");
	}
}
