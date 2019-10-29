package miniTest.miniTest02;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void setMap(Map<String, String> map) {
		map = new HashMap<String, String>();
		map.put("abc", "123");
	}
	public static void setMap2(Map<String, String> map) {
		map.put("test", "test");
	}
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map);
		setMap(map);
		System.out.println(map);
		setMap2(map);
		System.out.println(map);
	}
}

/*
 * {}
 * {}
 * test = test
 */