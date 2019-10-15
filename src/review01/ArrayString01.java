package review01;

import java.util.Random;

public class ArrayString01 {
	public static void main(String[] args) {
		String[] strs = new String[5];
		Random ran = new Random();
		
		for(int i=0; i<strs.length; i++) {
			int rNum = ran.nextInt(6) + 1;
			strs[i] = Integer.toString(rNum);
		}
		for(int j=0; j<strs.length; j++) {
			System.out.println("INDEX " + j + " : " + strs[j]);
		}
	}
}
