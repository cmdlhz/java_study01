package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class PersonExecute2 {
	public static void main(String[] args) {
		Person p = new Person();
		/*
		 *  Person.java 에서
		 *  
		 *  public String toString() {...}을 통해 override해주지 않으면
		 *  study01.test14.Person@15db9742
		 *  메모리 주소가 나옴
		 */
		System.out.println(p); // Person [name = null, age = 0, addr = null]
		
		List<Person> pList = new ArrayList<Person>();
		
		p.setName("Jen");
		p.setAge(24);
		p.setAddr("Seoul");

		p = new Person();
		// add가 뒤에 나옴
		pList.add(p);
		p.setName("Sky");
		p.setAge(20);
		p.setAddr("Tokyo");
		pList.add(p);
		
		System.out.println(pList); // [Person [name = Sky, age = 20, addr = Tokyo], Person [name = Sky, age = 20, addr = Tokyo]]
	}
}
