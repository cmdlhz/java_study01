package review01;

class Cat2 {
	public void sleep() {
		System.out.println("Sleeping.");
	}
	public void run() {
		System.out.println("Running");
	}
}

public class Inheritance04 extends Cat2 {
	public void sleep() {
		super.sleep();
		System.out.println("KoShort : Sleeping");
	}
	public void eat() {
		System.out.println("KoShort: Eating");
	}
	public static void main(String[] args) {
		Cat2 c2 = new Inheritance04();
		c2.run();
		
		Inheritance04 i4 = new Inheritance04();
		i4.sleep();
	}
}
