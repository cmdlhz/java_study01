package study01.test14;

/*
 * Abstract => 시제품 / prototype
 * Abstract Class에서 new가 안 되는 이유도 Interface와 같은 이유
 * 
 * 한번 정의해 버리면 이미 이 abstract 를 바라보는 수많은 class를 가리키는 class가 있으면 
 * 수정할 엄두가 안 남
 * 
 * 인터페이스 형태 분리
 * 클래스 특성 분리
 */

// 무조건 상속을 받은 class에서만 new라고 할 수 있다.

class Son33 extends AbstractClass{
	public void test3() {
		System.out.println("Test");
	}
}

public abstract class AbstractClass {
	public abstract void test3();
	
	public static void main(String[] args) {
		/*
		 * Cannot instantiate the type AbstractClass
		 */
//		AbstractClass ac = new AbstractClass();
		AbstractClass ac2 = new Son33();
		ac2.test3();
	}
}
