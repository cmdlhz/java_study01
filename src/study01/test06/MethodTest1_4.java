package study01.test06;

public class MethodTest1_4 {
	public static void main(String[] args) {
		// I made a space. => heap memory
		String str1 = new String("123");
		// Java made a space. => stack memory
		String str = "123";
		System.out.println("123" == "123");
		System.out.println(str == "123");
		// "123" refers to the stack memory
		System.out.println(str1 == "123");
		System.out.println(str);
		System.out.println(str1);
		// refers to different memory locations
		System.out.println(str == str1);
		
		int a = 123;
		System.out.println(a == 123);
		
		/*
		 * true
			true
			false
			123
			123
			false
			true
		 */
	}
}
