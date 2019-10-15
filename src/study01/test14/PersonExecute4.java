package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class PersonExecute4 {
	public static void main(String[] args) {
		Person p = new Person();

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
		
		p = pList.get(1);
		p.setName("Jo");
		p.setAge(50);
		
		System.out.println(pList); // [Person [name = Jen, age = 24, addr = Seoul], Person [name = Jo, age = 50, addr = Tokyo]]
	}
}
