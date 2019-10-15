package review01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		System.out.println(numList);
		
		List<Integer> numList2 = new LinkedList<Integer>();
		numList2.add(1);
		numList2.add(2);
		numList2.add(3);
		System.out.println(numList2);
		
//		ArrayList<Object> list = new ArrayList<Object>();
//		list.add(2);
//		list.add("3.3");
//		System.out.println(list);
	}
}
