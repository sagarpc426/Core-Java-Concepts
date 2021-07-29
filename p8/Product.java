package p8;

public class Product implements Comparable
{
	int pid,price;
	String name;
	
	public Product() {
	
		
	}
	public Product(int id,String nm,int pr) {
		pid=id;
		name=nm;
		price=pr;
	}
	@Override
	public String toString() {
	
		return pid+" "+name+" "+price;
	}
	@Override
	public int compareTo(Object ob) 
	{
		//type present in this ref is "Product" 
		Product p=(Product)ob;
		if(this.pid>p.pid)
			return 1;
		else if(this.pid<p.pid)
			return -1;
		else
			return 0;
	}
}
