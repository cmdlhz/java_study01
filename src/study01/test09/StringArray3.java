package study01.test09;

import java.util.ArrayList;

/*
 * Map: There's an order.
 * List : There is NOT an order. 
 */
public class StringArray3 {
	
	static void arrayPrintIn(String[] strs) {
		System.out.print("[");
		for(int i=0; i<strs.length; i++) {
			System.out.print(strs[i]);
			if(i != strs.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		String[] strs = new String[0];
		strs = new String[1];
		strs[0] = "1";
		strs = new String[2];
		strs[1] = "2";
		strs = new String[1];
		arrayPrintIn(strs); // null

		// After Java 1.8, "new ArrayList<>" is used.
		// <int> doesn't work.
		// When we print it, a value is printed. (instead of a memory location)
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("2");
		strList.remove(1);
		System.out.println(strList); // 1
	}
}

// Array is faster than ArrayList. But, the computer doesn't really notice the difference.'