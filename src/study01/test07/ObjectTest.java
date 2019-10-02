package study01.test07;

// "public" : only the name of the class same as the name of the file can exist in the file.
public class ObjectTest {
	// a #1 never dies!
	int a;
	
	public void test() {
		// a #2
		int a = 1;
		// a #2 becomes alive
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		// a #2 dies here.
	}
	public void test2() {
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.test();
		ot.test2();
	}
}
