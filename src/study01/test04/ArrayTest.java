package study01.test04;

// Ctrl + Shift + "O"
import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random r = new Random();
		
		for(int i=0; i<nums.length; i++) {
			// r.nextInt(45) : 0 ~ 44
			nums[i] = r.nextInt(45) + 1;
			// Get rid of duplicates
			for(int j = i-1; j>=0; j--) {
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
