package review01;

class Static02 {
	static int num2 = 222;
}

public class Static01 {
	int num1;
	static int num2;

	public static void main(String[] args) {
		Static01 st1 = new Static01();
		st1.num1 = 10;
		System.out.println("num1 (new object) : " + st1.num1);
		
		System.out.println("num2 : " + num2);
		num2 = 3;
		System.out.println("num2 (updating the value) : " + num2);
		
		Static01 st2 = new Static01();
		System.out.println("num1 (new object) : " + st2.num1);
		System.out.println("num1 (new object) : " + num2);
		
		System.out.println("num2 (different static int) : " + Static02.num2);
		
		int a = 3;
		System.out.println(a);
	}
}
