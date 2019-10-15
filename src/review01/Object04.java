package review01;

public class Object04 {
	String str1 = "";
	String str2 = "";
	String str3 = "te";
	String str4 = "te";
	
	public static void main(String[] args) {
		Object04 ot = new Object04();
		Object04 ot2 = new Object04();
		
		System.out.println(ot);	
		System.out.println(ot2);			
		System.out.println(ot == ot2);
		
		System.out.println(ot.str1 == ot2.str2);
		System.out.println(ot.str3 == ot2.str4);
	}
}
