package review01;

import java.util.ArrayList;

public class Loop01 {
	public static void main(String[] args) {
		// "for"
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
		
		// "while"
		int i =1;
		while(i<=3) {
			System.out.println(i);
			i++;
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		while(strList.size()<3) {
			strList.add("Hi");
		}
		System.out.println(strList);
	}
}
