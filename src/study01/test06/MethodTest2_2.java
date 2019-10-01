package study01.test06;

/*
 * can't be declared in this section.
 * *****************
 * int num;
 * int getNum(){ ... }
 */

public class MethodTest2_2 {
	int num;
	
	/*
	 *  int getNum(int num=3) 
	 *  ERROR 
	 */
 
	int getNum() {
		System.out.println(num);
		// A method can't use inside of another method.
		return 1;
	}
	
	public static void main(String[] args) {
		// Assign "0" in the line below.
		MethodTest2 mt2 = new MethodTest2();
		// Bring in "0" that was initialized in the line above.
		mt2.getNum();
	}
}