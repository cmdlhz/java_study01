package study01.test10;

class Father{
	public void test() {
		System.out.println("I'm a father.");
	}
}

public class Son01 extends Father{
	public void test() {
		System.out.println("I'm a son..");
	}
	
	public void sonsTest() {
		System.out.println("I have things not in Father's class.");		
	}
	
	public static void main(String[] args) {
	// ERROR
//		Son f = new Father();
		
		// Data type : Father.
		Father s = new Son01();
		Father f = new Father();
		
		f.test();
		// Overriding got applied.
		s.test();
		
		// ERROR
//		s.sonsTest();
	}
}
