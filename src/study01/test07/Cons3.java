package study01.test07;

public class Cons3 {
	int num;
	
	public Cons3() {
		System.out.println("Oh well, I'm called as well.");
	}
	
	public static void main(String[] args) {
		/*
		 * if there's a constructor that requires a parameter, "basic constructor" is not provided by Java.
		 */
//		Cons3 c = new Cons3(3);
//		System.out.println(c.num);
	}
}

/*
  * Oh well, I'm called as well.
  * 0
*/