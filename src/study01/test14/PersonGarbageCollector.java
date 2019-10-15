package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class PersonGarbageCollector {
	public static void main(String[] args) {
		/*
		 * garbage collector로 감
		 */
		Person p = new Person();
		p.setName("Jen");
		p.setAge(24);
		p.setAddr("Seoul");
		// 새로운 person을 가리킴
		p = new Person();
		
		System.out.println(p);
	}
}
