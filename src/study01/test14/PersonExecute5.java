package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class PersonExecute5 {
	public static void main(String[] args) {
		Person p = new Person();

		List<Person> pList = new ArrayList<Person>();
		
		p.setName("Jen");
		p.setAge(24);
		p.setAddr("Seoul");
		p = new Person();
		
		pList.add(p);
		System.out.println(pList); // [Person [name = null, age = 0, addr = null]]
		
		p.setName("Sky");
		p.setAge(20);
		p.setAddr("Tokyo");
		pList.add(p);
		
		// 이건 있으나 없으나 상관이 없음
		p = new Person();
		
		System.out.println(pList); // [Person [name = Sky, age = 20, addr = Tokyo], Person [name = Sky, age = 20, addr = Tokyo]]
	}
}
