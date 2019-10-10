package review01;

class Cat5{
	public void sleep() {
		System.out.println("Sleeping");
	}
}

public class Inheritance05 extends Cat5 {
	public void sleep() {
		System.out.println("KoShort : Sleeping");
	}
	public static void main(String[] args) {
		Inheritance05 i5 = new Inheritance05();
		i5.sleep();
		
		/*
		 * Most of ppl got it wrong.
		 */
		Cat5 i6 = new Inheritance05();
		i6.sleep();
		
		Cat5 c5 = new Cat5();
		c5.sleep();
	}
}
