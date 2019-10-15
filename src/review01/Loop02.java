package review01;

import java.util.ArrayList;

public class Loop02 {
	public static void main(String[] args) {
		ArrayList<String> strList2 = new ArrayList<String>();
		do {
			strList2.add("Hi1");
		} while(strList2.size() < 3);
		System.out.println(strList2);
	}
}
