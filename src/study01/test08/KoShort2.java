package study01.test08;

class Cat2{
	public void sleep() {
		System.out.println("A cat is sleeping.");
	}
	public void run() {
		System.out.println("A cat is running");
	}
}

public class KoShort2 extends Cat2{
	public void sleep() {
		super.sleep();
		System.out.println("A KoShort cat is sleeping.");
	}
	public void eat() {
		System.out.println("A KoShort eats.");
	}
	public static void main(String[] args) {
		Cat2 c2 = new KoShort2();
		c2.run();
		
		KoShort2 ks = new KoShort2();
		ks.eat();
	}
}

