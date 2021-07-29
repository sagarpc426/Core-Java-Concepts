package arraylist;

public class Employee implements Comparable
{
	int eid;
	double salary;
	String name;
	
	public Employee() {
	
		
	}
	public Employee(int id,String nm,double sal) {
		eid=id;
		name=nm;
		salary=sal;
	}
	@Override
	public String toString() {
	
		return eid+" "+name+" "+salary;
	}
	@Override
	public int compareTo(Object ob) 
	{
		//type present in this ref is "Employee" 
		Employee e=(Employee)ob;
		if(this.eid>e.eid)
			return 1;
		else if(this.eid<e.eid)
			return -1;
		else
			return 0;
	}
}
