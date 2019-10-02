package study01.test07;

class Calc{
	int num1;
	int num2;
	
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
		// when num2 is "0", we need to do a data validation check. 
		/*
		 * Exception in thread "main" 
			java.lang.ArithmeticException: / by zero
		 */
		System.out.println(num1 / num2);
	}
}

public class Execute {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.num1 = 5;
		calc.num2 = 2;
		calc.add();
		calc.minus();
		calc.mutiple();
		calc.division();
	}
}