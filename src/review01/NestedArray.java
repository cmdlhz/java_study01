package review01;

public class NestedArray {
	public static void main(String[] args) {
		int[][] nums = new int[4][];
		// ERROR : Runtime Exception
//		System.out.println(nums[0][1]);
		
		nums[0] = new int[3];
		System.out.println(nums[0][1]);
		
		nums[1] = new int[10];
		
		System.out.println("First floor : " + nums[0].length);
		System.out.println("Second floor: " + nums[1].length);
		
		System.out.println(nums[2]);
	}
}
