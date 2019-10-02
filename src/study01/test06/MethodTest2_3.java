package study01.test06;

// all different nums!!!

public class MethodTest2_3 {
	// num #1
	int num;
 
	int getNum() {
		// num #2
		int num;
		// ************* ERROR ***************
		// refers to num #2 (has not been initialized)
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The local variable num may not have been initialized
		 */
//		System.out.println(num);
		return 1;
	}
	
	public static void main(String[] args) {
		int num;
		// generates memory for MethodTest2()
		/*
		 * A computer doesn't read code before a class gets called below.
		 */
		MethodTest2_3 mt2 = new MethodTest2_3();
		mt2.getNum();
	}
}
