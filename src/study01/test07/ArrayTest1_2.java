package study01.test07;

public class ArrayTest1_2 {

	public static void main(String[] args) {
		String[] strs = new String[5];
		String str = "";
		System.out.println(str.indexOf(1)); // -1
		String str2 = null;
		/*
		 * ERROR
		 * Exception in thread "main" java.lang.NullPointerException
		 */
		System.out.println(str2.indexOf(1)); 
	}
}
