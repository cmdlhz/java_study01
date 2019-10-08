package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList3 {
	
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Double> dblList = new ArrayList<Double>();
		
		Random r = new Random();
		for(int i=0; i<10; i++) {
			strList.add(r.nextInt(100) + "." + r.nextInt(10));
			dblList.add(Double.parseDouble(strList.get(i)));
		}
		System.out.println(dblList);
		System.out.println(dblList.get(0) + dblList.get(1));
		
		/*
		 * 
		 * SORT IN A DESCENDING ORDER
		 * Find index 1
		 * Compare a value to the next one.
		 * If the next value is bigger than the stored one, put the next value in the index 0 and smaller one in the next index.
		 * (Use nested loops. & Swap)
		 * Repeat comparisons until we run out of values to compare with.
		 */
	}
}