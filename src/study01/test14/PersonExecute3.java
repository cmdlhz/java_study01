package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class PersonExecute3 {
	public static void main(String[] args) {
		Person p = new Person();

		List<Person> pList = new ArrayList<Person>();
		
		p.setName("Jen");
		p.setAge(24);
		p.setAddr("Seoul");
		pList.add(p);
		
		p.setName("Sky");
		p.setAge(20);
		p.setAddr("Tokyo");
		pList.add(p);
		p = new Person();
		
		System.out.println(pList); // [Person [name = Sky, age = 20, addr = Tokyo], Person [name = Sky, age = 20, addr = Tokyo]]
	}
}
