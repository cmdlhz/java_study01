package review01;

class Calculation{
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1 + num2);
	}
}

public class Execution01 {
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		calc.num1 = 5;
		calc.num2 = 10;
		calc.add();
		
		Calculation calc2 = new Calculation();
		calc2.add();
	}
}
