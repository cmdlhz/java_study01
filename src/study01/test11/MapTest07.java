package study01.test11;

import java.util.HashMap;

public class MapTest07{
	// static 신경쓰지 마세요. static 안 쓰면 복잡해져서 (static 안 쓰는건 MapTest09.java로 넘어가세요)
	static void changeMap(HashMap <String, String> map) {
		// makes a different map.
		
		// 나 자신을 바꾸면 연결이 끊어짐
		// 이걸 주석처리하면 내 안에 있는 걸 바꾸게 됨
		map = new HashMap<String, String>(); // 얘는 pass by reference 주석 처리하면 pass by value (밑의 값을 대체함)
		map.put("Age", "44");
		// 44는 여기서 죽음
	}
	
	public static void main(String[] args) {
		// this doesn't die.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Age", "33");
		changeMap(map);
		System.out.println(map);
	}
}

// {Age=33}
