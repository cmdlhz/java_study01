package study01.test08;

// Class Animal inherits an object (by Java)
class Animal5{

}

class Dog5 extends Animal5{
	public void test() {
		System.out.println("I'm a method in Dog5 class");
	}
}

public class Jindo5 extends Dog5{
	public static void main(String[] args) {
		Jindo5 j5 = new Jindo5();
		j5.test();
		
		Animal5 a5 = new Jindo5();
		// Animal5 is on a higher level than Dog5.
		// Animal5 doesn't know what things are belonged to classes lower than itself.
		// *********** ERROR
//		a5.test();
	}
}