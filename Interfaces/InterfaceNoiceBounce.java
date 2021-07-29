package Interfaces;

interface Bounceable{
	public void bounce();		
}

interface Noisable{
	public void noise();
}

class Ball implements Bounceable{
	public void bounce() {
		System.out.println("Ball can bounce");
	}
}

class Drum implements Noisable{
	@Override
	public void noise() {
		// TODO Auto-generated method stub
		System.out.println("Drum makes noise");
	}
}

public class InterfaceNoiceBounce {
	public static void main(String[] args) {
		Bounceable b = new Ball();
		b.bounce();
		
		Noisable n = new Drum();
		n.noise();
	}
}
