package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class PersonExecute {
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
		pList.add(p);
		
		p = new Person();
		p.setName("Sky");
		p.setAge(20);
		p.setAddr("Tokyo");
		pList.add(p);
		
		System.out.println(pList); // [Person [name = Jen, age = 24, addr = Seoul], Person [name = Sky, age = 20, addr = Tokyo]]
	}
}

/*
 * DTO : Data Transfer Object
 * VO : Value Object
 * 
 * 요즘에는 VO를 더 많이 사용함
 */