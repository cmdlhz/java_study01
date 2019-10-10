package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * human 순서 없음
 * List : 하나의 value로만 구성되어 있음
 * human : key-value pairs
 */

// Types
// - Hash human
// - ??? Hash human

/*
 * human의 데이터 타입 : Hashhuman<String,String>
 */
public class MapTest01 {
	public static void main(String[] args) {
		HashMap<String, String> human = new HashMap<String, String>();
		// Assign categories to values.
		human.put("Name", "Jen");
		human.put("Age", "25");
		human.put("Age", "45"); // 덮어씌움 ("25" 삭제) => 같은 키일 경우
		human.put("Nationality", "Korea");
	
		System.out.println(human);
		System.out.println(human.get("Name"));
		
		List<HashMap<String, String>> ppl = new ArrayList<HashMap<String, String>>();
		
		ppl.add(human);
		ppl.add(human);
		ppl.get(1).put("Name", "Jonathan");
		// 두 개는 같은 사람
		System.out.println(ppl);
		
		ppl.remove(human);
		System.out.println(ppl);
	}
}


/*
 * {Age=45, Nationality=Korea, Name=Jen}
 * Jen
 * [{Age=45, Nationality=Korea, Name=Jonathan}, {Age=45, Nationality=Korea, Name=Jonathan}]
 * [{Age=45, Nationality=Korea, Name=Jonathan}]
 */