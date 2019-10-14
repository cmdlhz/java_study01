package study01.test13;

public class Object01 {
	public static void main(String[] args) {
		Object t = new Object01();
		t = "123";
		t = new Integer(3);
		// int 3으로 자동 변환되서 적용됨 (형변환)
		t = 3;
		System.out.println(t);
	}
}
