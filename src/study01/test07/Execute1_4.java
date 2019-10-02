package study01.test07;

class Calc1_4{
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1 + num2);
	}
}

public class Execute1_4 {
	public static void main(String[] args) {
		Calc1_4[] calcs = new Calc1_4[3];
		// REQUIRED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		calcs[0] = new Calc1_4();
		/*
		 * If "calcs[0] = new Calc();" is not included, the following error occurs 
		 * : "Exception in thread "main" java.lang.NullPointerException".
		 */
		calcs[0].add();
	}
}