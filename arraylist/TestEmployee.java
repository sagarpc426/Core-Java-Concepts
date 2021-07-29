package arraylist;

import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> e1 = new ArrayList<>();
		e1.add(new Employee(11,"Jacob",10000));
		e1.add(new Employee(12,"Jordan",15000));
		e1.add(new Employee(13,"Sam",12000));
		e1.add(new Employee(14,"Amar",13000));
		System.out.println(e1);
		System.out.println(e1);
		Collections.sort(e1);
		System.out.println("\n*********Find by name*********");
		SearchUtil.SearchUtility(e1, "Sam");
		SearchUtil.SearchUtility(e1, "Sagar");
		System.out.println("\n********* Find by eid *********");
		SearchUtil.SearchUtility(e1, 12);
		System.out.println("\n*********** Data in e1 ArrayList ************");
		PrintUtil.PrintUtility(e1);
	}
}
