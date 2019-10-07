package study01.test09;

public class Test2 {
	int num1;
	static int num2;
	
	public static void main(String[] args) {
		String str1 = "1";
		String str2 = new String("1");
		
		System.out.println(str1 == str2);
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.contentEquals(new StringBuffer(str2)));
		
		//******** String Buffer (x10 faster)
		// when "new StringBuffer()" is used
	}
}
