package study01.test07;

class Mother{
	public void cook() {
		System.out.println("You need to cook to have lunch!");
	}
}

public class Son extends Mother{
	public void cook() {
		// "super" brings in the parent class's value in.
		super.cook();
		/*
		 *  "Overriding"
		 */
		System.out.println("I'll cook Ramen for lunch.");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.cook();
	}
}
