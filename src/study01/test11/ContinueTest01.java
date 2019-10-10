package study01.test11;

public class ContinueTest01 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			// SKIP !
			if(i% 2 == 0) continue;
			System.out.println(i);
		}
	}
}
