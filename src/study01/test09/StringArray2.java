package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray2 {
	public static void main(String[] args) {
		String[] strs = new String[5];
		
		// Insert
		Random ran = new Random();
		for(int i = 0; i < strs.length; i++) {
			int rNum = ran.nextInt(20) + 1;
			
			// Method 1
//			strs[i] = rNum + "";
			
			// Method 2
			strs[i] = Integer.toString(rNum);
		}
		
		// Print
		for(int i=0; i < strs.length; i++) {
			System.out.println(i + " : " + strs[i]);
		}
	}
}
