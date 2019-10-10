package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest02 {
	public static void main(String[] args) {
		HashMap<String, String> human = new HashMap<String, String>();
		// Assign categories to values.
		human.put("Name", "Jen");
		human.put("Age", "25");
		human.put("Nationality", "Korea");
	
		System.out.println(human);
		System.out.println(human.get("Name"));
		
		List<HashMap<String, String>> ppl = new ArrayList<HashMap<String, String>>();
		
		ppl.add(human);
		System.out.println(ppl);
	}
}

/*
 * {Age=25, Nationality=Korea, Name=Jen}
 * Jen
 * [{Age=25, Nationality=Korea, Name=Jen}]
 */