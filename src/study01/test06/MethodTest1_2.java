package study01.test06;

public class MethodTest1_2{
	public static void main(String[] args) {
		String str = new String("123");
		String str1 = "123";
		String str2 = new String("123");
		String str3 = str2;
		
		// compare memory locations
		System.out.println(str == str1);
		System.out.println(str1 == str2);
		System.out.println(str1 == str2);
		System.out.println(str == str2);
		
		// compare values
		System.out.println(str.contentEquals(str1));
		
		/*
		 * false
			false
			false
			false
			true
		 */
	}
}
