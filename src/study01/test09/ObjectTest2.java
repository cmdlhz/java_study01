package study01.test09;

class ObjectTest3{
	static int num2 = 222;
}

public class ObjectTest2 {
	// In this class, you can NOT reuse the name "num1";
	int num1;
	// Java puts "0" for us.
	static int num2;
	
	public static void main(String[] args) {
		ObjectTest2 ot2 = new ObjectTest2();
		ot2.num1 = 10;
		System.out.println("num1 (new object) : " + ot2.num1);
		
		// Because num2 is "static", we don't need to indicate the memory location like "num1"
		// num2 = ObjectTest.num2
		System.out.println("num2 : " + num2);
		num2 = 3;
		System.out.println("num2 (updating the value) : " + ObjectTest2.num2);
		ObjectTest2 ot3 = new ObjectTest2();
		System.out.println("num1 (new object) : " +ot3.num1);
		System.out.println("num2 (new object) : " + num2);

		// Need to indicate where it's located. (Because it's outside of the current class)
		System.out.println("num2 (Different static int) : " + ObjectTest3.num2);
	}
}
