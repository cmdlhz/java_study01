package review01;

public class Access02 {
	public static void main(String[] args) {
		System.out.println("Program BEGINS!");
		String[] strs = new String[5];
		
		try {
			strs[0].indexOf("1");
		} catch(Exception e) {
			System.out.println(strs[0]);
			System.out.println("There is an ERROR.....");
		}
		System.out.println("Program ENDS!");
	}
}
