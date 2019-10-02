package study01.test07;

public class Cons {
	int num = 5;
	
	public Cons() {
		// This line gets called SECOND. But, only after going through the entire code for class Cons.
		System.out.println(num);
		System.out.println("I'm called.");
	}
	public Cons(int num) {
		System.out.println("Oh well, I'm called as well.");
	}
	
	public static void main(String[] args) {
		// The following line gets called FIRST !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Cons c = new Cons();
		System.out.println(c.num);
	}
}

/*
  * 5
  * I'm called.
  * 5
*/