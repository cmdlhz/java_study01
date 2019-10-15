package review01;

public class DataType01 {
	int num1;
	static int num2;
	
	public static void main(String[] args) {
		String str1 = "1";
		String str2 = new String("1");
		
		System.out.println(str1 == str2);
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.contentEquals(new StringBuffer(str2)));
	}
}
