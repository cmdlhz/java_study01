package review01;

public class Object03 {
	String str1 = "";
	String str2 = "";
	
	public static void main(String[] args) {
		Object03 ot = new Object03();
		Object03 ot2 = new Object03();
		
		System.out.println(ot == ot2);
		System.out.println(ot.str1 == ot2.str2);
		System.out.println(ot.str1 == ot2.str1);
		
		
		ot.str1 = new String("");
		ot2.str1 = new String("");
		
		System.out.println(ot.str1 == ot2.str1);
	}
}