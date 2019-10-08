package study01.test10;

public class FinalTest {
	/*
	 * ERROR
	 * "final" is a constant.
	 */
//	final int num;
	
	// The following works!
	static final int num;
	static {
		num = 1;
	}
	// 
	
	public static void main(String[] args) {
		// "final" = the variable can't be changed.
		final int a = 3;
		/*
		 * ERROR
		 */
//		a = 5;
	}
}
