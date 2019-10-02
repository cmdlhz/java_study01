package study01.test07;

class Calc1_2{
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1 + num2);
	}
}

public class Execute1_2 {
	public static void main(String[] args) {
		Calc1_2 calc = new Calc1_2();
		calc.num1 = 5;
		calc.num2 = 3;
		calc.add();
		
		Calc calc2 = new Calc();
		calc2.add();
	}
	// "calc" dies here.
}

/*
 * 8
 * 0
 */