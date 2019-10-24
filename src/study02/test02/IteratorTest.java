package study02.test02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorTest {
	public static Map<String, String> getParameterMap(){
		Map<String, String> pMap = new HashMap<String, String>();
		pMap.put("gameName", "Candy Crush");
		pMap.put("genre", "N/A");
		pMap.put("creDate", "2019-10-27");
		return pMap;
	}
	
	public static void main(String[] args) {
		Map<String, String> map = getParameterMap();
		// Set : 중복 불가
		Set<String> keys = map.keySet();
		
		// 순서가 없음
		Iterator<String> it = keys.iterator();
		// 다음에 데려올 값이 있는지 없는지 묻는 것
		while(it.hasNext()) {
			// 다음 line이 없으면 무한 loop에서 벗어나지 못함
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		// 이렇게 쓸 이유가 없음 . 어차피 put 한 순서대로 나오는게 아니므로
		Object[] keys2 = map.keySet().toArray();
		for(int i=0; i<keys2.length; i++) {
			System.out.println(keys2[i]);
		}
	}
}

/*
gameName : Candy Crush
creDate : 2019-10-27
genre : N/A
gameName
creDate
genre
 */