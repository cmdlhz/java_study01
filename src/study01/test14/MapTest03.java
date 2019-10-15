package study01.test14;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest03 {
	public static void main(String[] args) {
		HashMap<String, String> map3 = new HashMap<String, String>();
		
		map3.put("name", "Kevin");
		map3.put("age", "30");
		map3.put("gender", "male");
		
		Iterator<String> it = map3.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map3.get(key));
		}
	}
}
