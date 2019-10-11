package study01.test12;

public class Test {
	public String str = "String";
	
	// Constructor
	/*
	 * 1) no return type
	 * 2) Same name (including capital letter)
	 * 3) static 아님
	 * 4) 무조건 실행됨
	 */
	public Test() {
		System.out.println("Constructor");
	}
	
	// Method
	public void a() {
		System.out.println("Method");		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.a();
	}
}

/*
Constructor
Method
*/