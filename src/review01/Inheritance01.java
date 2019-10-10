package review01;

class Dog3{
	public void greet() {
		System.out.println("hello");
	}
}

class Puddle3{
	public  void play() {
		System.out.println("Let's play together!");
	}
}

public class Inheritance01 extends Dog3 {
	public static void main(String[] args) {
		// Inheritance inherits Dog3.
		Dog3 d3 = new Inheritance01();
		d3.greet();
		
		// ********* ERROR *********
		// Type mismatch: cannot convert from Puddle3 to Dog3
//		Dog3 d4 = new Puddle3();
		
		// ********* ERROR *********
		// Dog3 is on a higher level than Puddle3.
		// Dog3 doesn't know what things are belonged to classes lower than itself.
//		d3.play();
	}
}
