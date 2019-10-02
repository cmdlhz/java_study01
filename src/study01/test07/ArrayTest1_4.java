package study01.test07;

public class ArrayTest1_4 {

	public static void main(String[] args) {
		System.out.println("Program BEGINS!");
		String[] strs = new String[5];
		for(int i = 0; i < strs.length; i++) {
			strs[i] = (i +1) * 10 + "";
		}
		for(int j = 0; j < strs.length; j++) {
			System.out.println(strs[j]);
		}
	}
}