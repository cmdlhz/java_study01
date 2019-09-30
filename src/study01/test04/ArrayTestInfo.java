package study01.test04;

public class ArrayTestInfo {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=i-1; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
