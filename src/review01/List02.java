package review01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
		List<String> strList4 = new ArrayList<String>();
		List<String> strList5 = new LinkedList<String>();
		
		strList4.add("1");
		strList4.add("2");
		strList4.add("3");
		
		strList5.add("4");
		strList5.add("5");
		strList5.add("6");
		
		System.out.println(strList4);
		System.out.println(strList5);
		
		strList4.remove(0);
		strList5.remove(0);
		
		System.out.println(strList4);
		System.out.println(strList5);
		
		strList4.set(0, "10");
		strList5.set(0, "10");
		
		System.out.println(strList4);
		System.out.println(strList5);

		System.out.println(strList4.size());
		System.out.println(strList5.size());
	}
}
