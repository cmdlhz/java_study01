package study01.test11;

import java.util.ArrayList;

/*
 * List : 순서 있음
 * Map : 순서 없음
 */

public class WhileTest02 {
	public static void main(String[] args) {
		ArrayList<String> strList2 = new ArrayList<String>();

		// 무조건 한 번은 실행 후 비교
		do {
			strList2.add("Add something!");
		} while(strList2.size() < 3);
		}
}
