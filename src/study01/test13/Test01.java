package study01.test13;

public class Test01 {
	public static void main(String[] args) {
		String[] strs = new String[0];
		// 방하나 늘리기
		strs = new String[strs.length + 1];
		// 마지막 방에 value 추가
		strs[strs.length-1] = "123";
		
		System.out.println(strs.length); // 1
	}
}
