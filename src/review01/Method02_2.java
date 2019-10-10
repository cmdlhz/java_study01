package review01;

public class Method02_2 {
	int num;

	int getNum() {
		int num;
		/*
		 * Compile Error
		 * The local variable num may not have been initialized.
		 */
//		System.out.println(num);
		return 1;
	}
	
	public static void main(String[] args) {
		int num;
		Method02_2 test = new Method02_2();
		test.getNum();
	}
}
