package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * List is an interface. So, we don't need to use "new" to call it.
 * We can call ArrayList as a List.
 * 
 * ArrayList : 순서가 있음 (0부터 시작). Index 존재.
 * LinkedList : 앞, 뒤를 알고 있음. Index 존재.
 * Map : 순서를 모름. 하지만, 각각의 element의 존재는 앎. key-value 연결이 되어 있음. key, value 공간이 따로 있고.
 * 
 * Map is also an interface. Also, we can call HashMap as a Map.
 */

/*
 * Map 순서 NO
 * List 순서가 있어서 for문 돌면서 원하는 값을 마음대로 출력할 수 있음
 */

public class HashMap01 {
	public static void main(String[] args) {
//		List<String> strList = new ArrayList<String>();
//		strList.add("a");
//		strList.add("b");
//		strList.add("c");
//		
//		for(int i = 0; i < strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
		
		/*
		 * Replace : Substring 처럼 원데이터가 변하지 않음. 변한데이터를 원 데이터에 덮어씌워야 함.
		 */
		System.out.println("potato".replace("o", "-").substring(0,4));
		
		/*
		 * DESIGN PATTERN
		 * 개발에 사용하는 용어 => 건설 쪽에서 많이 가져옴
		 */
		Map<String, String> map = new HashMap <String, String>();
		map.put("Fav Color 1", "Green");
		// "Fav Color 1"과 "Fav Color 2"는 같은 "Green"을 가리킴
		map.put("Fav Color 2", "Green");
		map.put("Fav Singer", "Too many...");
		System.out.println(map.get("Fav Color 1") == map.get("Fav Color 2"));
		
		// keySet(), iterator() => method의 호출, 생성자 아님. (자기 영역 없고, 소문자로 시작)
		// method에도 데이터 타입이 있다. So, we can use "."을 쓸 수 없음
		// 하지만, method에 data type이 없다는 개발자도 틀린 건 아님
		// void는 아무 곳에도 대입할 수 없어서 "."을 쓸 수 없음. 다른 language에서는 void도 data type이지만 Java에서는 아님!
		/*
		 * 분리한다면(위에서 String이라고 했으니까)
		 * Set<String> keySet = map.keySet();
		 * Iterator<String> it = keySet.iterator();
		 */
		// iterator가 keySet에 속한게 아니라 이어서 쓴 것일뿐
		Iterator<String> it = map.keySet().iterator();
		// "is" & "has" 있으면 결과가 boolean
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key);
			String value = map.get(key);
			System.out.println("value : " + value);
		}
	}
}
