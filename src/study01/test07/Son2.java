package study01.test07;

class Mother2{
	public void cook() {
		System.out.println("You need to cook to have lunch!");
	}
}

public class Son2 extends Mother{
	/*
	 * "Overloading"
	 */
	public void cook(int a) {
		System.out.println("I'll cook Ramen for lunch.");
	}
	
	public static void main(String[] args) {
		// "new" : make me new memory!
		/*
		 * constructor : Son2()
		 * If there is no method of the constructor, Java makes it for us.
		 * ex)
		 * public Son() { ... } 
		 * => It's called "Basic constructor".
		 */
		Son2 s = new Son2();
		s.cook();
		
		// Because "s.cook(int a)" requires only integers, s.cook can't handle strings.
//		s.cook("abc");
	}
}
