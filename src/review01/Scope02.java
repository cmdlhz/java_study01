package review01;

public class Scope02 {
	// a #1
	int a;
	
	public void test() {
		// a #2
		int a  =10;
		// a #2 becomes alive. 
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		// a #2 dies here.
	}
	public void test2() {
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);		
	}
	public static void main(String[] args) {
		Scope02 scope = new Scope02();
		scope.test();
		scope.test2();
	}
}
