package study01.test02;

public class Var1 {
	public static void main(String[] args) {
		int x = 1;
		int z = 5;
		if(x == 1) {
			int y = 10;
			z = 500;
		}
		int y = 300;
		System.out.println(x + " - " + y + " - " + z);
		
		for( ; x<10; x++) {
			System.out.println(x);
		}
		System.out.println(x);
	}
}
