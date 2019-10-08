package study01.test10;

import java.util.Random;

public class SortingDescending {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		Random r = new Random();
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
		}
		
		for(int i = 0; i < nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j] > nums[i]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
