package study01.test06;

public class ObjectTest {
	int num1;
	int num2;
	// We made it.
	String str = new String("");
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ObjectTest ot2 = new ObjectTest();
		
		// False : different memory address
		System.out.println(ot.str == ot2.str);
	}
}
