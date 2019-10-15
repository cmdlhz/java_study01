package review01;

public class Final01 {
	static final int num;
	static {
		num = 1;
	}
	/*
	 * When you don't include "final" here, you get the following checked error in "num" in System.out.println(num);
	 * Cannot make a static reference to the non-static field num
	 */
//	final int num = 3;
	
	public static void main(String[] args) {
		final int a = 3;
		// ERROR! "final" variable can't be reassigned.
//		a = 4;
		
		System.out.println(num);
		System.out.println(a);
	}
}
