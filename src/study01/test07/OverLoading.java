package study01.test07;

/*
 * Ctrl + F : Find & Replace all at once!
 */

public class OverLoading {
	/*
	 * SAME method name
	 */
	public void test() {
		System.out.println("Call the test() method !");
	}
	// different parameter
	public void test(int num) {
		System.out.println("Call the test(int num) method !");
	}
	// different parameter type
	public void test(String str) {
		System.out.println("Call the test(String str) method!");
	}
	// different number of parameters
	public void test(String str, int num) {
		System.out.println("Call the test(String str, int num) method!");
	}
	// different order of parameters
	public void test(int num, String str) {
		System.out.println("Call the test(int num, String str) method!");
	}
	
	// Because there is no data type called "void", can't call methods above.
	// This one works because the data type is "int", not "void".
	public int test1() {
		return 0;
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test("hello", 2);
		ol.test(2, "hello");
		
		System.out.println(ol.test1());
	}
}