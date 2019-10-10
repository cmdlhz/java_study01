package study01.test11;

import java.util.HashMap;

public class MapTest06 {
	static void changeMap(HashMap <String, String> map) {
//		map = new HashMap<String, String>();
		map.put("Age", "44");
	}
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Age", "33");
		changeMap(map);
		System.out.println(map);
	}
}

// {Age=44}