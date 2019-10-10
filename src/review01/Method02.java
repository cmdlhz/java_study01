package review01;

public class Method02 {
	// num #1
	int num;
	
	int getNum() {
		System.out.println(num); // refers to num #1
		// num #2
		int num;
		return 1;
	}
	
	public static void main(String[] args) {
		// num #3
		int num;
		Method02 test = new Method02();
		test.getNum();
	}
}
