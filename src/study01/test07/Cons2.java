package study01.test07;

public class Cons2 {
	int num;
	
	public void cons2() {
		System.out.println("I'm called.");
	}
	
	public static void main(String[] args) {
		Cons2 c = new Cons2();
		/*
		 * Cons() : constructor/생성자
		 * Differences to method : no return type, no overriding, no protected, needs to be same as the name of class
		 */
		System.out.println(c.num);
		// to refer to "int num" without "static"
	}
}

/*
  * only "0" gets printed. 
*/