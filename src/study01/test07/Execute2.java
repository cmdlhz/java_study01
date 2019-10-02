package study01.test07;

class Calc2{
	private int num1;
	private int num2;
	
	// Use a constructor
	public Calc2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() {
		System.out.println(num1 + num2);
	}
	public void minus() {
		System.out.println(num1 - num2);
	}
	public void mutiple() {
		System.out.println(num1 * num2);
	}
	public void division() {
		System.out.println(num1 / num2);
	}
}

public class Execute2 {
	public static void main(String[] args) {
		Calc2 calc = new Calc2(15, 5);
		calc.division();
	}
}