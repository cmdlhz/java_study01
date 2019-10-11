package study01.test12;

/*
 * ===== Debugging =====
 * Double click the line on the left => Set a breakpoint here.
 * Alt + Shift + D
 * (Popup Msg => 디버깅 모드 화면으로 전환하시겠습니까?)
 * F8 : next step
 * F6: next line
 * Ctrl + Shift + i : method 값을 보기 위해서
 */

public class PadTest {
	public static void main(String[] args) {
		String str = "1";
		int max = 4;
		// 3번째 순서에서 2<1이 되어 for문을 나가버림
		for(int i=1; i<=max-str.length(); i++) {
			str += "0";
			System.out.println(str);
		}
	}
}
