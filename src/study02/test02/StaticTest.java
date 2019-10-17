package study02.test02;

public class StaticTest {
	static int a;
	// 자바 메모리에 이미 올라감
	
//	final static int b;
	// 내가 바꾸지 않기 위해서 final을 쓰는 건데 이건 자바가 0 으로 바꾸므로 안 됨
	
	static {
		a = 10;
		System.out.println("It works~~~");
	}
	// 미리 메모리에 올려놓는 것 : free loading
	
	// 필요할 때 메모리에 올리는 것 : lazy loading
	
	public static void main(String[] args) {
		System.out.println(StaticTest.a);
	}
}
