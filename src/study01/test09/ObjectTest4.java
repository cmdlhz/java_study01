package study01.test09;

public class ObjectTest4 {
	int num1;
	// Java initialize a static variable for us.
	static int num2;
	
	public static void main(String[] args) {
		ObjectTest4 ot4 = new ObjectTest4();
		ot4.num1 = 10;
		
		// RESET!!! (Initialize a variable again)
		ot4 = new ObjectTest4();
		System.out.println(ot4.num1);
		
		System.out.println(num2);
		
		// Just changing the value of the object.
		num2 = 10;
		
		// RESET!!!
		ot4 = new ObjectTest4();
		System.out.println(num2);
		
		// Must initialize a variable!
		// The following doesn't work!
		// int a;
		// System.out.println(a);
		
		/*
		 * "static int num2" dies here
		 */
	}
}
