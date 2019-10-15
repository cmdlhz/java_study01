package review01;

import java.util.HashMap;

public class Map02_2 {
	static HashMap<String, String> changeMap(HashMap<String, String> map) {
		map = new HashMap<String, String>();
		map.put("Name", "Julia");
		return map;
	}
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Name", "Kyle");
		map = changeMap(map);
		System.out.println(map);
	}
}
