package study01.test10;

class Mother{
	void  hobby() {
		System.out.println("My hobby is painting.");
	}
}

public class testTest extends Mother {
void work() {
		System.out.println("I work at an IT company.");
	}
	public static void main(String[] args) {
		testTest s = new testTest();
		s.hobby();
	}
}
