package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Jo");
		map.put("age", "30");
		
		// Interface
		/*
		 * ArrayList, LinkedList 는 list 설계서를 참고해서 구현한 것
		 * list라고 부를 수 있는 최소 요건을 만족
		 * 안에서 어떻게 작동하는 지는 상관없음
		 * 
		 * Hashmap도 map 설계서를 참고해서 구현한 것
		 */
		List<HashMap<String, String>> mapList = new ArrayList<HashMap<String, String>>();
		mapList.add(map);
		map.put("gender", "female");
		System.out.println(mapList); // [{gender=female, name=Jo, age=30}]
		
		/*
		 * add가 된 시점은 중요치 않음
		 */
	}
}
