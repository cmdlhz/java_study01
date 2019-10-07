package study01.test09;

import java.util.ArrayList;

/*
 * Wrapper Class
 * 
 * byte => Byte
 * short => Short
 * int => Integer *********
 * long => Long
 * float => Float
 * double => Double
 * char => Character *********
 * boolean => Boolean
 * 
 * Integer, Long, Double =====> Things are usually being used.
 */

public class IntArray2 {
	public static void main(String[] args) {
		int a = 1;
		Integer i = new Integer(1);
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		System.out.println(numList);
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(2);
		list.add("3.3");
		System.out.println(list);
	}
}
