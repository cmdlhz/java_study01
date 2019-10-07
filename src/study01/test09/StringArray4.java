package study01.test09;

import java.util.ArrayList;

public class StringArray4 {
	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(str.indexOf("C"));
		
		ArrayList<String> strList2 = new ArrayList<String>();
		
		strList2.add("Jo");
		strList2.add("Mark");
		strList2.add("Kevin");
		strList2.add("Jen");
		
		System.out.println("===== Class List =====");
		for(int i=0; i<strList2.size(); i++) {
			System.out.println(i + " - " + strList2.get(i));
		}
		
		System.out.println("Jen is @ " + strList2.indexOf("Ashley"));
	}
}
