package review01;

public class Constructor01 {
	int x = 10;
	
	/*
	 * Default Constructor is inserted if a user doesn't provide it.
	 */
	public Constructor01() {
//		x = 29;
	}
	
	public static void main(String[] args) {
		Constructor01 test = new Constructor01();
		System.out.println(test.x);
	}
}
