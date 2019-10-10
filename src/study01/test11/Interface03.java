package study01.test11;

interface Promise3 {
	public int test();
	void test1();
}

public class Interface03 extends Father implements Promise2 {
	public int test() {
		return 1;
	}
	public void test1() {
		
	}
	public String toString() {
		return "No more memory address!";
	}
	
	public static void main(String[] args) {
		System.out.println(new Interface02());
		System.out.println(new String("abc"));
	}
}