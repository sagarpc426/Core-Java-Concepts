package p8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;



public class Test1 {
	
	public static void main(String[] args) {
		
		//non generic list/raw type 
		ArrayList l1=new ArrayList();
		l1.add(20);
		l1.add(40);
		l1.add(33);
		l1.add(66);
		l1.add(33);
		l1.add(null);
		l1.add("Pune");
		l1.add(10.77f);
		l1.add(9910.77);
		l1.add(new Product(1001,"Mobile",20000));
		System.out.println(l1);
		
		System.out.println("******* Elements of  l2 ");
		ArrayList l2=new ArrayList();
		l2.add(20);
		l2.add(40);
		l2.add(33);
		l2.add(66);
		l2.add(33);
		l2.add(0,44);
		System.out.println("using for each loop *******");
		for(Object ob:l2)
		{
			System.out.println(ob);
		}
		
		Collections.sort(l2);
		
		System.out.println("List after sort [using iterator] *******");
		
		//Enumeration e;
				
		Iterator it = l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		//ListIterator lt;
		
		
		System.out.println("*******");
		
		ArrayList l7=new ArrayList();
		l7.addAll(l2);		
		System.out.println(l7);
		
		
		
		//generic list with Integer type only 
		ArrayList<Integer> l3=new ArrayList<>();
		l3.add(20);
		l3.add(30);
		l3.add(10);
		System.out.println(l3);
		
		for(Integer ob:l3)
		{
			System.out.println(ob);
		}
		
		
		ArrayList<Product> l4=new ArrayList<>();
		l4.add(new Product(1002,"Mobile",20000));
		l4.add(new Product(1001,"TV",30000));
		l4.add(new Product(1003,"AC",40000));
		System.out.println(l4);
		
		for(Product ob:l4)
		{
			System.out.println(ob.name);
		}
		
		ArrayList l5=new ArrayList();
		l5.add(new Product(1002,"Mobile",20000));
		l5.add(new Product(1001,"TV",30000));
		l5.add(new Product(1004,"AC",25000));
		l5.add(new Product(1003,"WashingMachine",220000));
		System.out.println(l5);
		
		Collections.sort(l5); 
		
		for(Object ob:l5)
		{
			Product p=(Product)ob;			
			//System.out.println(p.name);
			System.out.println(p);
		}
		
		
		
		
		LinkedList ld1=new LinkedList();
		ld1.add(22);
		ld1.add(21);
		ld1.add(20);
		ld1.add(23);
		ld1.add(0, 10);
		ld1.addFirst(30);
		ld1.addLast(40);
		System.out.println(ld1);
		ld1.addAll(l2);
		System.out.println(ld1);
		
		//Thread safe class,legacy class / 1.0 Version class
		// Initial and incremental capacity of Vector and AL
		Vector v1=new Vector();
		
		System.out.println("Stack ************");
		Stack s1=new Stack();
		s1.push(10);
		s1.push(40);
		s1.push(30);
		s1.push(20);
		System.out.println(s1);
		System.out.println("pop ele "+s1.pop());//removes and returns top ele
		System.out.println("After pop "+s1);
		System.out.println("peek ele "+s1.peek());//returns top ele
		System.out.println("After pop "+s1);
		
				
		
	}
	

}
