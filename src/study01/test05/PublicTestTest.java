package study01.test05;

public class PublicTestTest {
	public int num;
	
	public static void main(String[] args) {
		PublicTestTest pt = new PublicTestTest();
		System.out.println(pt.num);
		
		PrivateTestTest pt2 = new PrivateTestTest();
		System.out.println(pt2.num);
		
//		PrivateTestTest pt3 = new PrivateTestTest();
//		System.out.println(pt3.num2);
	}
}
