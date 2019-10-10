package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest03 {
	public static void main(String[] args) {
		HashMap<String, String> human2 = new HashMap<String, String>();
		human2.put("Name", "Jen");
		
		List<HashMap<String, String>> ppl2 = new ArrayList<HashMap<String, String>>();
		
		ppl2.add(human2);
		ppl2.add(human2);
		human2.put("Name : ", "Joy");
		System.out.println(ppl2);
	}
}

// [{Name : =Joy, Name=Jen}, {Name : =Joy, Name=Jen}]