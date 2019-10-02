package study01.test07;

class Calc3{
	private int num1;
	private int num2;
	
	// Use a constructor!
	public Calc3(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void division() {
		System.out.println(num1 / num2);
	}
}

public class Execute2_exercise {
	public static void main(String[] args) {
		Calc3 c = new Calc3(20, 4);
		c.division();
	}
}