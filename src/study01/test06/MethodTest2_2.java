package study01.test06;

/*
 * can't be declared in this section.
 * *****************
 * int num;
 * int getNum(){ ... }
 */
//int num;
//int num = 1;
//System.out.println(num);

public class MethodTest2_2 {
	int num;
	
	/*
	 *  int getNum(int num=3) 
	 *  ERROR 
	 */
 
	int getNum() {
		System.out.println(num);
		// A method can't be used inside of another method.
		return 1;
	}
	
	public static void main(String[] args) {
		// Execute MethodTest2_2 class
		MethodTest2_2 mt2 = new MethodTest2_2();
		// Execute getNum() inside of the MethodTest2_2 class
		mt2.getNum();
	}
}