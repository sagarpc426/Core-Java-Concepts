package HashSetExample;

import java.util.HashSet;

public class Parle {
	private int p_id;
	private String pname, location;
	private HashSet<?> products;
	public Parle() {
		
	}
	public Parle(int p_id, String pname, String location, HashSet<?> products) {
		this.p_id = p_id;
		this.pname = pname;
		this.location = location;
		this.products = products;
	}
	
	public String toString() {
		return "Product Id: "+p_id+", Product Name: "+pname+", Location: "+location+", SubList: "+products;
	}
	
}
