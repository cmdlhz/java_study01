package study01.test06;

public class ObjectTest1_3 {
	int num1;
	int num2;
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ObjectTest ot2 = new ObjectTest();
		
		// Refers to different things
		System.out.println(ot == ot2);
		// Remember "0" once
		// Cuz it's a primitive type (int)
		// EXAAAAAAAAAAAAAAAAAMMMMMM
		System.out.println(ot.num2 == ot2.num1);		
	}

/*
 * false
true

 */
}
