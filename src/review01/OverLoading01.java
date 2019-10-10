package review01;

public class OverLoading01 {
	public void test() {
		System.out.println("test()");
	}
	public void test(int num) {
		System.out.println("test(int num)");
	}
	public void test(String str) {
		System.out.println("test(String str");
	}
	public void test(String str, int num) {
		System.out.println("test(String str, int num)");
	}
	public void test(int num, String str) {
		System.out.println("test(int num, String str)");
	}
	public int test1() {
		return 10;
	}
	public static void main(String[] args) {
		OverLoading01 ol = new OverLoading01();
		ol.test("hello", 2);
		ol.test(2, "hello");
		System.out.println(ol.test1());
	}
}
