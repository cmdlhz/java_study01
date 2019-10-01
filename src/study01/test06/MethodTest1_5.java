package study01.test06;

public class MethodTest1_5 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 7;
		nums[1] = 5;
		nums[2] = 10;
		nums[3] = 66;
		nums[4] = 27;
		
		int searchNum = 5;
		for(int i=0; i < nums.length; i++) {
			if(nums[i] == searchNum) {
				System.out.println("Found in Room " + i);
			}
		}
	}
}
