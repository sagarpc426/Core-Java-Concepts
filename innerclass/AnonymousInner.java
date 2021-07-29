package innerclass;

interface Read{
	void book();
	void novel();
}
public class AnonymousInner {

	public static void read() {
		
		// anonymous inner class - a class without name is called anonymous
		
		Read r1 = new Read() {
			@Override
			public void book() {
				// TODO Auto-generated method stub
				System.out.println("Reading a book using method");
			}
			@Override
			public void novel() {
				// TODO Auto-generated method stub
				System.out.println("Reading a novel using method");
			}
		};
		r1.book();
		r1.novel();
	}
	
	public static void main(String[] args) {
		
		// anonymous inner class - a class without name is called anonymous
		Read r = new Read()
		{
			public void book() {
				System.out.println("Reading a book in main");
			}
			public void novel() {
				System.out.println("Reading a novel in main");
			}
		};
		r.book();
		r.novel();
		read();
	}

}
