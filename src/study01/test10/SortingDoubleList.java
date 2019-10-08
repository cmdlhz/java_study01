package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class SortingDoubleList {
	public static void main(String[] args) {
		// Easy to  edit
		// no property like "length"
		// Instead, there are methods like ".size()", ".get()"
		ArrayList<Double> dblList = new ArrayList<Double>();
		
		dblList.add(1.1);
		dblList.add(1.3);
		dblList.add(0.5);
		dblList.add(3.4);
		dblList.add(5.3);
		dblList.set(0, 1.5);
		
		for(int i=0; i<dblList.size(); i++) {
			for(int j=i+1; j<dblList.size(); j++) {
				if(dblList.get(i) > dblList.get(j)) {
					double temp = dblList.get(i);
					dblList.set(i,  dblList.get(j));
					dblList.set(j,  temp);
				}
			}
		}
		
		System.out.println(dblList);
	}
}
