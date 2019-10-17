package study02.test02;

public class Null {
	static String a;
	int num;
	
	public static void main(String[] args) {
		System.out.println(Null.a);
		
		Null n = new Null();
		// 0을 알아서 넣어줌
		// 위에서 위치를 가르쳐줬기 때문에
		System.out.println(n.num);
		
		int num2;
		// 여기서는 아님. 바라보는 게 아무것도 없어서 찍어줄게 없음
//		System.out.println(num2);
	}
}

/*
 * 메모리 생성 => 인스턴스화
 */