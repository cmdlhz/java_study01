package study01.test10;

public class FinalTest2 {
	// To let everyone know that it's a constant, use an uppercase & an underbar
	final int NUM_TEST = 1;
	
	public static void main(String[] args) {
		int num = 5;
		
//		String str = "num is '3'.";
//		if(num!=3 ) {
//			str = "num is not a '3'.";
//		}

		/*
		 * ternary operator
		 */
		String str = (num==3) ? "num is '3'." : "num is not a '3'.";
		
		System.out.println(str);
		
		/*
		 * "A instanceof B" : Can I call "B" as "A"?
		 */
		System.out.println(str instanceof String);
	}
}
