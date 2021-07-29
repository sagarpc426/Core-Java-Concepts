package p8;

import java.util.Comparator;

public class CompareByName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {

		//type present in this ref is "CompareByPrice"
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return p1.name.compareTo(p2.name);
	}
	
}