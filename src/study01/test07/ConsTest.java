package study01.test07;

public class ConsTest {
	int num;
	/*
	 * Java automatically makes a "basic constructor" for us.
	 */
//	public ConsTest() {
//		
//	}
	
	public static void main(String[] args) {
		ConsTest ct = new ConsTest();
		System.out.println(ct.num); // "0"
	}
}
