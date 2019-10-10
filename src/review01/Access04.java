package review01;

public class Access04 {
	int num = 5;
	
	void cons() {
		System.out.println(num);
		System.out.println("I'm called.");
	}
	void cons(int num) {
		System.out.println("Oh, well... I'm called.");
	}
	
	public static void main(String[] args) {
		Access04 acc = new Access04();
		acc.cons(3);
		System.out.println(acc.num);
	}
}
