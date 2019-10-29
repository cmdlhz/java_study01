package practices;

public class Return2 {
	public static int test2(int a) {
		if(a == 1) {
			System.out.println("a is 1.");
			return 1;
		}
		if(a == 2) {
			System.out.println("a is 2.");
			return 2;
		}
		System.out.println("test() is called");
		return 3;
	}
	
	public static void main(String[] args) {
		int a = test2(2);
		System.out.println(a);
	}
}

// a is 2.
// 2
