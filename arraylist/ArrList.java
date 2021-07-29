package arraylist;

import java.util.ArrayList;

class Product
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
}

public class ArrList {
	
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
		
		
		ArrayList l2=new ArrayList();
		l2.add(20);
		l2.add(40);
		l2.add(33);
		l2.add(66);
		l2.add(33);
		for(Object ob:l2)
		{
			System.out.println(ob);
		}
		
		
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
		l5.add(new Product(1003,"AC",40000));
		System.out.println(l5);
		
		for(Object ob:l5)
		{
			Product p=(Product)ob;			
			System.out.println(p.name);
		}
		for(int i=0; i<l5.size(); i++) {
			System.out.println(l5.get(i));
		}
	}
	

}
