package review01;

public class InstanceOf {
	final int NUM_TEST = 1;
	
	public static void main(String[] args) {
		int num = 5;
		
		String str = (num==3) ? "num is 3." : "num is not 3.";
		System.out.println(str);
		
		System.out.println(str instanceof String);
	}
}
