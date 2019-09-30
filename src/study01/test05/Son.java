package study01.test05;

class Father{
	void work() {
		System.out.println("My father works at a bank.");
	}
}

public class Son extends Father {
//	void work() {
//		System.out.println("I work at an IT company.");
//	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}