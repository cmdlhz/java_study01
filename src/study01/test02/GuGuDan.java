package study01.test02;

public class GuGuDan {
	public static void main(String[] args) {
		int num = 1;
		int max = 10;
		for(int i =1; i<max; i++) {
			System.out.print(num + " x " + i + " = " + (num * i));
			if(i != max-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
