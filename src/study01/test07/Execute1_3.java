package study01.test07;

class Calc1_3{
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1 + num2);
	}
}

public class Execute1_3 {
	public static void main(String[] args) {
		Calc1_3[] calcs = new Calc1_3[3];
		Calc calc = null;
		Calc calc2 = new Calc();
		// 0
		calc2.add();
		// ERROR
		calc.add();
	}
}

/*
  * 0
  * Exception in thread "main" java.lang.NullPointerException
*/