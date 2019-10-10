package review01;

class CalcExec {
	private int num1;
	private int num2;
	
	// Use a constructor!
	public CalcExec(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void division() {
		System.out.println(num1 / num2);
	}
}

public class Constructor02{
	public static void main(String[] args) {
		CalcExec calc = new CalcExec(20, 2);
		calc.division();
	}
}
