package study01.test12;

import java.util.ArrayList;
import java.util.List;

public class ListEtc {
	public static void main(String[] args) {
		List<String> nums = new ArrayList<String>();
		// ZERO FILL
		// Instead of "1", fill "0" in front of a number
		nums.add("01");
		nums.add("11");
		nums.add("02");
		// 그러면 순서대로 정렬됨
		// 안 그러면 1 - 11 - 2
	}
}
