package study01.test14;

class End{
	final void test() {
		System.out.println("I'm test method.");
	}
}
/*
 * ************ Method
 * Pen이라는 부모 Class가 있다면 그 안에 
 * write() class를 자식 Class가 절대 재정의해서는 안 된다!
 */

public class FinalMethod extends End {
	// 다른 언어에서는 "final" 대신 "const"가 쓰임
	static final String STR_EXAM = "abc";
	/*
	 * final은 method & class에도 쓰일 수 있음
	 * => method에 쓰이면 overriding이 안 됨
	 */
	// FinalMethod overrides final method test()
	// ============ ERROR ============
//	void test() {
//		System.out.println("I'm NOT test method.");
//	}
	
	public static void main(String[] args) {
		
	}
}
