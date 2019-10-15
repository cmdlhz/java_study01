package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class Execute01 {
	public static List<Person> getPersonListFormDB(){
		List<Person> pList = new ArrayList<Person>();
		Person p = new Person();
		for(int i=1; i<=20; i++) {
			p.setName("Name : " + i);
			p.setAge(i);
			p.setAddr("Addr : " + i) ;
			pList.add(p);
			// 이 line이 없으면 다 덮어씌움...
			p = new Person();
		}
		return pList;
	}
	
	public static void main(String[] args) {
		List<Person> pList = getPersonListFormDB();
		
		for(int i =0; i<pList.size(); i++) {
			Person p = pList.get(i);
			System.out.println(p);
		}
	}
}
