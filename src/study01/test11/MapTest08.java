package study01.test11;

import java.util.HashMap;

public class MapTest08{
	static HashMap<String, String> changeMap(HashMap <String, String> map) {
		// makes a different map.
		map = new HashMap<String, String>();
		map.put("Age", "44");
		return map;
	}
	
	public static void main(String[] args) {
		// this doesn't die.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Age", "33");
		map = changeMap(map);
		System.out.println(map);
	}
}

// {Age=44}
