package study01.test06;

// all different nums!!!

public class MethodTest2_4 {
	// num #1
	int num;
 
	int getNum() {
		// Refers to num #1
		System.out.println(num);
		// num #2
		int num;
		return 1;
	}
	
	public static void main(String[] args) {
		int num;
		// generates memory for MethodTest2()
		MethodTest2 mt2 = new MethodTest2();
		mt2.getNum();
	}
}
