package review01;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("=== THE START ===");
		
//		String strNum = "onetwothreefour";
		String strNum = "1234";
		
		try {
			System.out.println("The process of changing '" + strNum + " to the 'int' type starts now!");
			int num = Integer.parseInt(strNum);
			System.out.println("The process of chaning '" + strNum + " to the 'int' type ends!");
		} catch(Exception e) {
			System.out.println(strNum +" is not a number.");
		} finally {
			System.out.println("=== This gets printed no matter what!");
		}
		System.out.println("=== THE END ===");
	}
}
