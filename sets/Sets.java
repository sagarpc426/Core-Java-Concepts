package sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add("Sagar");
		h1.add(40);
		h1.add("MITAOE");
		h1.add("Alandi");
		System.out.println("HashSet = "+h1);
		
		TreeSet t1 = new TreeSet();
		//t1.add("ABCD");
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(30);
		System.out.println("TreeSet = "+t1);
		
		LinkedHashSet l1 = new LinkedHashSet();
		
		
		HashMap hm = new HashMap();
		hm.put(1, 10);
		hm.put(2, "Sagar");
		System.out.println("HashMap = "+hm);
		
		// thread safe, can't have null value and key, unordered and unsorted
		Hashtable ht = new Hashtable();
		ht.put(1, "SAGAR");
		ht.put(2,"Chaudhari");
		ht.put(3, 48);
		System.out.println("Hashtable = "+ht);
		
		//null key not allowed 
		// null value is allowed
		// key has to be of same type
		
		TreeMap tm = new TreeMap();
		
		// oprdered, null values and keys are allowed
		LinkedHashMap lm = new LinkedHashMap();
		
		
	}

}
