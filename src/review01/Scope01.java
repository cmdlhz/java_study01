package review01;

public class Scope01 {
	public static void main(String[] args) {
		int x = 1;
		int z = 3;
		int y;
		if(x == 1) {
			y = 10;
			System.out.println(y);
		}
		y = 300;
		System.out.println(x + ", " + y);
		System.out.printf("%d, %d, %d", x, y, z);
	}
}
