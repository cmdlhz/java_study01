package practices;

public class Return {
	public static void test(int a) {
		if(a == 1) {
			System.out.println("a is 1.");
			return;
		}
		if(a == 2) {
			System.out.println("a is 2.");
			return;
		}
		System.out.println("test() is called");
	}
	
	public static void main(String[] args) {
		test(2);
	}
}

// a is 2.