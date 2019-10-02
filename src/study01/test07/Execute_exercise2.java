package study01.test07;

class Calcul{
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1 + num2);
	}
	public void minus() {
		System.out.println(num1 - num2);
	}
	public void multiple() {
		System.out.println(num1 * num2);
	}
	public void division() {
		System.out.println(num1 / num2);
	}
}

public class Execute_exercise2 {
	
	public static void main(String[] args) {
		Calcul calc = new Calcul();
		calc.num1 = 22;
		calc.num2 = 33;
		
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
	}
}
