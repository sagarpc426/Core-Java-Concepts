package arraylist;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.*;

public class ArrList1 {

	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add("Sagar");
		data.add("MIT Academy of Engineering");
		data.add(48);
		System.out.println(data);
		
		ArrayList<Double> marks = new ArrayList<>();
		marks.add(550.0);
		marks.add(700.0);
		System.out.println(marks);
		
		// iterator - sequential access. Forward direction only
		Iterator i1 = data.iterator();	// universal interface
		//	enumeration works with legacy class only.
		// listiterator works with List only.
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		LinkedList ld1 = new LinkedList();
		ld1.add(10);
		ld1.addFirst(20);
		ld1.add(30);
		ld1.addLast(40);
		System.out.println(ld1);
		ld1.addAll(data);
		System.out.println(ld1);
		
		// legacy class, thread safe
		// Initial and incremental capacity of vector vs arraylist
		
		Vector v1 = new Vector();
		v1.addAll(ld1);
		System.out.println(v1);
		
		// stack
		Stack s1 = new Stack();
	}

}
