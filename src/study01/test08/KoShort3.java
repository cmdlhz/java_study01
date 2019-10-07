package study01.test08;

class Cat3{
	public void sleep() {
		System.out.println("A cat is sleeping.");
	}
}

public class KoShort3 extends Cat3{
	public void sleep() {
		System.out.println("A KoShort cat is sleeping.");
	}
	public static void main(String[] args) {
		// Overriding
		KoShort3 ks2 = new KoShort3();
		ks2.sleep();
		
		/*
		 * Most of people got it wrong.
		 */
		Cat3 ks3 = new KoShort3();
		ks3.sleep();
		
		Object ks4 = new KoShort3();
		/*
		 * In Object, there's no "sleep()". So, a compile error occurs.
		 */
//		ks4.sleep();
	}
}

/*
 * A KoShort cat is sleeping.
 */