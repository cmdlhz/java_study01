package review01;

public class Object01 {
	int num1;
	int num2;
	String str = new String("");
	
	public static void main(String[] args) {
		Object01 ot = new Object01();
		ot.num1 = 3;
		ot.num2 = 5;
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		
		// Like resetting a game (going back to Level 1)
		ot = new Object01();
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		
		Object01 ot2 = new Object01();
		System.out.println(ot.str == ot2.str); // Different memory address
	}
}
