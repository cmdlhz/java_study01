package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.Vector;

/*
 * <Collection Framework>
 * 배열 변수를 쉽게 사용할 수 있게 해줌
 * 
 * List - an interface (can't use "new")
 * Map 
 * Set 
 */

public class ListTest01 {
	public static void main(String[] args) {
		// SPEED : ArrayList > LinkedList
		List<String> strList1 = new ArrayList<String>();
		// 순서 x => 앞뒤를 알고 있음
		List<String> strList2 = new LinkedList<String>();
		
		// Don't use "vector"!!!
//		List<String> strList3 = new Vector<String>();

		/*
		 * ArrayList vs LinkedInst : 노트 필기 참조! p.35
		 */
		
	}
}
