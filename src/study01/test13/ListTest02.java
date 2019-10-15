package study01.test13;

public class ListTest02 {
	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "123";
		strs[1] = "abc";
		strs[2] = "ABC";
		
		String str = "[";
		for(int i=0; i<strs.length; i++) {
			str += strs[i] + ", ";
		}
		str = str.substring(0, str.length()-2);
		str += "]";
		System.out.println(str);
		
		/*
		 *  "substring" : 문자열 잘라내기
		 *  => doesn't alter the original value.
		 */
		
		String test = "12345";
//		System.out.println(test.substring(2)); // 345
//		System.out.println(test.indexOf("3")); // 2
//		System.out.println(test); // 12345
		
		/*
		 * Starting index : 2 (including) - value : 3
		 * Ending index : 4 (excluding) - value : 5
		 */
		test = test.substring(2, 4);
		System.out.println(test); // 34
	}	
}
