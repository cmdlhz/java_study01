package review01;

class Mother2{
	public void cook() {
		System.out.println("You need to cook to have lunch!");
	}
}

public class Son02 extends Mother2 {
	public void cook(int a) {
		System.out.println("I'll cook Ramen for lunch.");
	}
	public static void main(String[] args) {
		Son02 s = new Son02();
		s.cook();
		s.cook(3);
		// Only "integers" can be entered here. ("int a")
//		s.cook("s");
	}
}
