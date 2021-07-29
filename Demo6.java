

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//A
//B - A a

class Product implements Externalizable
{

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
}

class Emp implements Serializable
{
	int id;
	String name;
	int salary;
	
	transient int creditcardno ;
	
	static int count; // not serialized
	
	Emp()
	{
		id=1;
		name="Soham";
		salary=9000;
	}
	public Emp(int id,String name,int salary) {

		this.id=id;
		this.name=name;		
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}



class Manager extends Emp
{
	int bonus;
	
	public Manager() {
		
		super();
	
	}
	public Manager(int id,String name,int salary,int bonus) 
	{
		super(id,name,salary);
		this.bonus=bonus;
	}
	@Override
	public String toString() {
		return "manager [bonus=" + bonus + "]"+super.toString();
	}
	
	
}

class Address implements Serializable
{
	int pincode;
	public Address() {
	
	}
	public Address(int p) {
		
		pincode=p;
	}

	@Override
	public String toString() {
		return "pincode = "+pincode;
	}
}

//container class
class Student implements Serializable
{
	Address add; //contained Object
	int rollno;
	public Student() {
	
	}
	public Student(Address a,int r) 
	{
		add=a;
		rollno=r;		
	}
	@Override
	public String toString() {
	
		return "rollno = "+rollno+" "+add.toString();
	}
}




public class Demo6 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		
	/*	FileOutputStream fo=new FileOutputStream("d:\\student.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		ObjectOutputStream os=new ObjectOutputStream(bo);
		
		Student s=new Student(new Address(411008),1);
		os.writeObject(s);
		os.close();
		
		
		FileInputStream fin=new FileInputStream("d:\\student.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		
		Student s1=(Student)oin.readObject();		
		System.out.println(s1);	*/
		
		/*
    	FileOutputStream fo=new FileOutputStream("d:\\mgr1.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		ObjectOutputStream os=new ObjectOutputStream(bo);
		
		Manager m=new Manager(101, "Deepa", 25000,1000);
		os.writeObject(m);
		os.close();
		
		
		FileInputStream fin=new FileInputStream("d:\\mgr1.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		
		Manager m1=(Manager)oin.readObject();		
		System.out.println(m1);	
		*/
	
		FileOutputStream fo=new FileOutputStream("d:\\empinfo.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		ObjectOutputStream os=new ObjectOutputStream(bo);
		
		Emp e=new Emp(101, "Deepa", 65000);
		System.out.println("e = "+e);
		os.writeObject(e);
		System.out.println("Object is serialized ");
		os.close();
		
		
		FileInputStream fin=new FileInputStream("d:\\empinfo.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		
		Emp e1=(Emp)oin.readObject();//deserialization
		
		System.out.println(e1);	
		
	}

}
