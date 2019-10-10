package study01.test11;

import java.util.ArrayList;

public class WhileTest01 {

	public static void main(String[] args) {
		// ***** For *****
		for(int i = 1; i<=5; i++) {
			System.out.println(i);	
		}
		
		// ***** While *****
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		while(strList.size() < 3) {
			strList.add("Add something!");
		}
		System.out.println(strList);
	}
}
