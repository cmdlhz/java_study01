package review01;

import java.util.ArrayList;
import java.util.Random;

public class Sorting01 {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();		
		ArrayList<Double> dblList = new ArrayList<Double>();
		Random r = new Random();
		
		for(int i=0; i<5; i++) {
			strList.add(r.nextInt(100) + "." + r.nextInt(10));
			dblList.add(Double.parseDouble(strList.get(i)));
		}
		
		for(int i=0; i<dblList.size(); i++) {
			for(int j=i+1; j<dblList.size(); j++) {
				if(dblList.get(i) > dblList.get(j)) {
					double tempList = dblList.get(i);
					dblList.set(i,dblList.get(j));
					dblList.set(j,tempList);
				}
			}
		}
		System.out.println(dblList);
		// [8.3, 18.2, 20.0, 20.8, 73.9]
	}
}
