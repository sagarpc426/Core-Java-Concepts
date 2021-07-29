package generic_collection;

public class Gen<T> {
	// To denote Generic - <>
	// primitive types are not allowed while using generic
	// types on both the sides must be same
	T obj;
	Gen(){
		
	}
	
	Gen(T obj){
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Gen<Integer> g1 = new Gen<Integer>(new Integer(100));	// upcasting
		//Integer i1 = (Integer)g1.getObj();	// no need to downcast
		System.out.println(g1.getObj());
		
		@SuppressWarnings("deprecation")
		Gen<Double> g2 = new Gen<Double>(new Double(2000));
		//Double i2 = (Double)g2.getObj();	// no need to downcast
		System.out.println(g2.getObj());
		
//		g1 = g2;	// type not same, code not safe
//		System.out.println(g1 == g2);
		
	}

}
