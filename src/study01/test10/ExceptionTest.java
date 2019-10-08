package study01.test10;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("==== THE START ===");
		
		String strNum = "onetwothreefour";
//		String strNum = "1234";
		try {
			System.out.println("The process of changing \"" + strNum + "\" to the \"int\" type starts now!");
			/*
			 * int java.lang.Integer.parseInt(String s) throws NumberFormatException
			 */
			int num = Integer.parseInt(strNum);
			// The following line doesn't get printed if there's an error.
			System.out.println("The process of changing \"" + strNum + "\" to the \"int\" type ends !");			
		} catch(Exception e) {
			System.out.println("\"" + strNum + "\" is not a number.");
		} finally {
			System.out.println("==== This gets printed no matter what! ===");
		}
		System.out.println("==== THE END ===");
	}
}
