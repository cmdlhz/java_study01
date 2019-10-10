package review01_practice;

public class Access02_p {
	public static void main(String[] args) {
		System.out.println("System BEGINS!");
		String[] strs = new String[5];
		
		try {
			strs[0].indexOf("1");
		} catch(Exception e){
			System.out.println(strs[0]);
			System.out.println("There's an error.");
		}
		System.out.println("System ENDS!");
	}
}
