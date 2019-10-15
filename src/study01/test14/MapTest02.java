package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest02 {
	public static void main(String[] args) {
		HashMap<String, String> map2;
		List<HashMap<String, String>> mapList2 = new ArrayList<HashMap<String, String>>();
		
		for(int i =1; i<=10; i++) {
			map2 =  new HashMap<String, String>();
			map2.put("name", "Kevin " + i);
			map2.put("age", i + "");
			if(i%2 == 0) {
				 map2.put("gender", "F");
			} else {
				map2.put("gender", "M");
			}
			mapList2.add(map2);
		}
		for(int i=0; i<mapList2.size(); i++) {
			System.out.println(mapList2.get(i));
		}
	}
}
