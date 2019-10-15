package review01;

interface Promise02{
	public int test();
	void test01();
}

public class Interface01 implements Promise02{
	public int test() {
		return 2;
	}
	public void test01() {
		
	}
	public String toString() {
		return "no more memory address!";
	}
	public static void main(String[] args) {
		System.out.println(new Interface01());
		System.out.println(new String("abc"));
	}
}
