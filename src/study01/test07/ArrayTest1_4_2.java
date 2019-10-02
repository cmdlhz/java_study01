package study01.test07;

public class ArrayTest1_4_2 {

	static void printArray(String[] strs) {
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program BEGINS!");
		String[] strs = new String[5];
		for(int i = 0; i < strs.length; i++) {
			strs[i] = (i +1) * 20 + "";
		}
		printArray(strs);
	}
}