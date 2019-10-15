package review01;

import java.util.HashMap;

public class Map02 {
	static void changeMap(HashMap<String, String> map) {
		map.put("Name", "Julia");
	}
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Name", "Kyle");
		changeMap(map);
		System.out.println(map);
	}
}
