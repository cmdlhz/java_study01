package study01.test06;

public class ObjectTest1_4 {
	int num1;
	int num2;
	// Java made it.
	String str = " ";
	
	public static void main(String[] args) {
		ObjectTest1_4 ot = new ObjectTest1_4();
		ObjectTest1_4 ot2 = new ObjectTest1_4();
		
		// true true false
		/*
		 * Already made : doesn't make it again.
		 */
		System.out.println(ot.str == ot2.str);		
		ot2.str = " ";
		System.out.println(ot.str == ot2.str);
		
		// We made it.
		ot2.str = new String(" ");
		System.out.println(ot.str == ot2.str);
		ot.str = new String(" ");
		System.out.println(ot.str == ot2.str);
	}
}
