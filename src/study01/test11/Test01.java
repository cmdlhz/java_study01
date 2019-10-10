package study01.test11;

// Class is static. (Oracle Official Document says)

public class Test01 {
	// Class variable (No need to instantiate)
	public static int num1 = 3;
	
	static int num = 3;
	
	public static void main(String[] args) {
		// ERROR
		// 여기서는 선언할 수 없음 : static, public
		// 	static int num = 3;
		
		// static이므로 memory loading을 할 필요가 없음
		System.out.println(num);
		System.out.println(Test01.num1);
	}
}
