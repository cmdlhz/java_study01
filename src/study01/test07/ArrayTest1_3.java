package study01.test07;

public class ArrayTest1_3 {

	public static void main(String[] args) {
		System.out.println("Program BEGINS!");
		String[] strs = new String[5];
		try {
			strs[0].indexOf("1");
		} catch(Exception e) {
			System.out.println("There is an ERROR...");
		}
		System.out.println("Program ENDS.");
	}
}