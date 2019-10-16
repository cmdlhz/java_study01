package study01.test15;

import java.util.Iterator;
// 순서는 없지만, put 한데로 그대로 나옴. 앞뒤를 알고 있을 뿐.
// linkedlist는 연결된 링크를 따라가는 것
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap01 {
	public static void main(String[] args) {
		Map<String, String> map2 = new LinkedHashMap<String, String>();
		map2.put("color1", "red");
		map2.put("color2", "sky blue");
		map2.put("color3", "purple");
		map2.put("color4", "black");
		map2.put("color5", "yellow");
		
		Iterator<String> it = map2.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map2.get(key));
		}
	}
}

/* 순서대로 출력됨
 * 1 - 2 - 3 - 4 - 5 순으로 출력
 */

/*
 * 빠른 속도 때문에 ArrayList & HashMap을 주로 씀
 */