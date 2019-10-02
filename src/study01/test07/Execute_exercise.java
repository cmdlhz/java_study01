package study01.test07;

class Calculate{
	int num1;
	int num2;
	
	 void add() {
		System.out.println(num1 + num2);
	}
	 void minus() {
		System.out.println(num1 - num2);
	}
	 void multiple() {
		System.out.println(num1 * num2);
	}
	 void division() {
		System.out.println(num1 / num2);
	}
}

public class Execute_exercise {
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		calc.num1 = 12;
		calc.num2 = 10;
		
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
	}
}