package study01.test03;

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] =(2 * (i + 2)) - 2;
//			nums[i] = (i+1)*2;
			System.out.println("Index " + i + " / Value " + nums[i]);
		}
	}
}
