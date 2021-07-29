package Interfaces;

interface movable{
	void move();
}

class Person implements movable {
	public void move() {
		System.out.println("Person is moving");
	}
}

class Animal{
	
}

class Girraffe extends Animal implements movable{
	public void move() {
		System.out.println("Girraffe is moving");
	}
}

class Vehicle{
	
}

class Bike extends Vehicle implements movable{
	public void move() {
		System.out.println("Bike is moving");
	}
}

public class InterfacesExamples {
	
	public static void main(String[] args) {
		
		// interface is collection of abstract methods with public access modifier
		// "implements" keyword must be used to use interface
		// methods declared in an interface must be implemented/defined by child classes
		
		movable m1 = new Person();
		m1.move();
		
		m1 = new Girraffe();
		m1.move();
		
		m1 = new Bike();
		m1.move();
	}

}
