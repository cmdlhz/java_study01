package study01.test07;

public class Cons5 {
	int num;
	
	public Cons5() {
		// This line gets called SECOND. But, only after going through the entire code for class Cons5.
		System.out.println("I'm called.");
	}
	public Cons5(int num) {
		System.out.println("Oh well, I'm called as well.");
	}
	
	public static void main(String[] args) {
		// The following line gets called FIRST !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Cons5 c = new Cons5(3);
		// to refer to "int num" in line 4.
		System.out.println(c.num);
	}
}

/*
  * Oh well, I'm called as well.
  * 0
*/