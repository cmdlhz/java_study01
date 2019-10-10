package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest04 {
	public static void main(String[] args) {
		HashMap<String, String> human3 = new HashMap<String, String>();
		human3.put("Name", "Jen");
		
		List<HashMap<String, String>> ppl3 = new ArrayList<HashMap<String, String>>();
		
		ppl3.add(human3);
		ppl3.add(human3);
		
		human3 = new HashMap<String, String>();
		// 새로 어디를 바라봐야할지 몰라서 빈 {}이 나옴
		System.out.println(human3); // {}
		System.out.println(ppl3.get(0)); // {name=Jen}
		System.out.println(ppl3);
	}
}

/*
 * {}
 * {Name=Jen}
 * [{Name=Jen}, {Name=Jen}]
 */