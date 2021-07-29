package Interfaces;

interface RemoteDevice{
	void switchOn();
	void switchOff();
}

class TV implements RemoteDevice {
	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("TV is on");
	}
	
	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("TV is off");
	}
}

class DVDPlayer implements RemoteDevice{
	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("DVD Player is on");
	}
	
	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("DVD Player is off");
	}
}

public class InterfaceRemoteDevice {
	
	public static void testRemote(RemoteDevice r) {
		r.switchOn();
		r.switchOff();
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteDevice r1 = new TV();
		testRemote(r1);
//		r1.switchOn();
//		r1.switchOff();
		
		r1 = new DVDPlayer();
		testRemote(r1);
//		r1.switchOn();
//		r1.switchOff();
	}

}
