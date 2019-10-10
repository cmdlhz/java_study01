package review01;

public class Object02 {
	int num1 = 3;
	int num2 = 3;
	
	public static void main(String[] args) {
		Object02 ot = new Object02();
		Object02 ot2 = new Object02();
		
		System.out.println(ot == ot2);
		System.out.println(ot.num2 == ot2.num1);
	}
}
