package study01.test11;

import java.util.HashMap;

public class MapTest05 {
	static void changeMap(HashMap <String, String> map) {
		map.put("name", "Julia");
	}
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		changeMap(map);
		System.out.println(map);
	}
}

// {name=Julia}