package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_review {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("color1", "red");
		map.put("color2", "sky blue");
		map.put("color3", "purple");
		map.put("color4", "black");
		map.put("color5", "yellow");
		
		Iterator<String> show = map.keySet().iterator();
		// It's important to know if it has NEXT~~~
		while(show.hasNext()) {
			String key = show.next();
			System.out.println("key : " + key);
			String value = map.get(key);
			System.out.println("value : " + value);
		}
	}
}

/*
 * 1 - 2 - 5 - 3 - 4 순으로 출력
 */