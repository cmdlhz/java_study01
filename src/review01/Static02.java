package review01;

public class Static02 {
	public static int num1 = 3;
		
	public static void main(String[] args) {
		
		// ERROR
		// 	Illegal modifier for parameter num3; only final is permitted
//		static int num3 = 10;
//		public int num4 = 3;
	
		final int num5 = 9;
		
		System.out.println(num1);
		System.out.println(Static02.num1);
		System.out.println(num5);
	}
}
