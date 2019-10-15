package review01;

import java.util.HashMap;

public class Map03_2 {
	 void changeMap(HashMap<String, String> map) {
		map = new HashMap<String, String>();
		map.put("Name", "Julia");
	}
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Name", "Kyle");
		
		Map03_2 m = new Map03_2();
		m.changeMap(map);
		System.out.println(map);
	}
}
