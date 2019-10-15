package study01.test14;

import java.util.HashMap;

public class MapTest2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Kyle");
		p.setAddr("Busan");
		p.setAge(33);
		// ERROR !!!!!
//		p.setTrans("Female");
		System.out.println(p);
		
		// Object는 쓰지 마세요. 어쩔 수 없을 때만 빼고!
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Ken");
		map.put("age", 33);
		map.put("addr", "Sydney");
		map.put("gender", "Female");
		System.out.println(map);
		
		/*
		 * 추가 항목을 추가하려면 list는 list 자체를 바꿔야 하지만
		 * map은 추가만 하면 됨
		 */
	}
}
