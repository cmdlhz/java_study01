package study01.test05;

// Ctrl + Shift + "O"
import study01.test04.PrivateTest;

class Test{
	private int num;
}

public class PublicTest {
	int num = 2;
	
	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.num);
		
		PrivateTest pt2 = new PrivateTest();
		System.out.println(pt2.num);
		
		// can't use "private" data outside of the scope.
		Test t = new Test();
		// ************* ERROR *************
//		System.out.println(t.num);
	}
}
