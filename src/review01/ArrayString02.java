package review01;

import java.util.ArrayList;

public class ArrayString02 {
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
		arrayPrintIn(strs);
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.remove(0);
		System.out.println(strList);
	}
}
