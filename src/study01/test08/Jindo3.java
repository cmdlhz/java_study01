package study01.test08;

class Dog3{
	public void greet() {
		System.out.println("hello");
	}
}

class Puddle3{

}

public class Jindo3 extends Dog3 {
	public static void main(String[] args) {
		// Jindo3 inherits Dog3.
		Dog3 d3 = new Jindo3();
	
		//********* ERROR
//		Dog d3 = new Puddle3();
	}
}