package study01.test06;

public class ObjectTest1_2 {
	int num1;
	int num2;
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.num1 = 5;
		ot.num2 = 10;
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		
		// like resetting a game (going back to Level 1)		
		ot = new ObjectTest();
		System.out.println(ot.num1);
		System.out.println(ot.num2);
	}

/*
 * 5
10
0
0
 */
}