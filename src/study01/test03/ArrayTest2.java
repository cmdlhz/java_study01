package study01.test03;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arrays = new int[10];
		for(int i = 0; i < 10; i++) {
			arrays[i] = 10 * (i+1);
			System.out.println("Index " + i + " / Value " + arrays[i]);
		}
	}
}
