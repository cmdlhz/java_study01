package study01.test07;

public class Cons4 {
	int num;
	
	public static void main(String[] args) {
		// "Basic constructor" gets generated.
		Cons4 c = new Cons4();
		System.out.println(c.num);
		
		// "Scanner" needs a parameter (ex) System.in)
		// ERROR
//		Scanner scan = new Scanner();
//		Scanner scan = new Scanner(System.in);
	}
}