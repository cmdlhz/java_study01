package review01;

class Calculation02{
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1 + num2);
	}
}

public class Execution02 {
	public static void main(String[] args) {
		Calculation02 calc = new Calculation02();
		calc = null;
		
		Calculation02 calc2 = new Calculation02();
		calc2.add();
		calc.add();
	}
}
