package study01.test10;

class Father2{
	public void test2() {
		System.out.println("I'm a father.");
	}
}

public class Son02 extends Father2{
	public void test2() {
		System.out.println("I'm a son..");
	}
	
	public void sonsTest2() {
		System.out.println("I have things not in Father's class.");		
	}
	
	public static void main(String[] args) {
		Father2 s2 = new Son02();
		
		Son02 s3 = (Son02)s2;
		s3.sonsTest2();
		
		Father2 f2 = new Father2();
		
		// Can I call you(f2) as Son02?
		// Similar : Is one of you guys "Jen"?
		if(f2 instanceof Son02) {
			// Because the condition is false, the following lines don't get executed.
			// No compile ERROR
			// Therefore, we need to check in this way.
			s3 = (Son02)f2;
			s3.sonsTest2();	
		}
	}
}

/*
 * Object-Oriented 
 * : smallTalk => C++ => Java
 * : Variable => Array => ArrayList => Object => Inheritance => Overriding, Overloading
 */