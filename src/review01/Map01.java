package review01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map01 {
	public static void main(String[] args) {
		HashMap<String, String> human = new HashMap<String, String>();
		
		human.put("Name", "Jen");
		human.put("Age", "25");
		human.put("Age", "30");
		System.out.println(human);
		System.out.println(human.get("Name"));
		
		List<HashMap<String, String>> ppl = new ArrayList<HashMap<String, String>>();
		
		ppl.add(human);
		ppl.get(0).put("Name", "Kyle");
		System.out.println(ppl);
		
		ppl.remove(human);
		System.out.println(ppl);
		
		human = new HashMap<String, String>();
		System.out.println(human);
	}
}
