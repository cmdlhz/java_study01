package study01.test12;

// STEP #3
class Father{
	// STEP #4
	// Object까지 다 읽고 옴	
	public Father() {
		// STEP #5
		System.out.println("Father");
	}
}

public class Test2 extends Father {
	
	// STEP #2
	public Test2() {
		// STEP #6
		System.out.println("Constructor");
	}
	
	public void a() {
		System.out.println("Son");
	}
	
	public static void main(String[] args) {
		// STEP #1
		Father t = new Test2();
		// a 못 씀 (아빠의 탈을 쓰고 있음)
		/*
		 * 리모컨 공통으로 만들려고 그렇게 쓰는 것
		 */
		
		// Test2를(자식을) 알려줘야 함
		((Test2)t).a();
	}
}

/*
 * Father
 * Constructor
 */





/*
 * Interface : 행동 개념
 * Class : 상속
 */