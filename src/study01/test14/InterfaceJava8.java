package study01.test14;

// Works from 1.8

interface Test{
	/*
	 * Inteface에서 scope을 가질 수 있는 경우 
	 * 1) static
	 * 2) default
	 */
	static void print() {
		System.out.println("I'm in the interface.");
	}
	
	// 접근제어자 default가 아님, 기본이라는 뜻
	default void print2() {
		
	}
}

public class InterfaceJava8 {

	/*
	 * Default methods are allowed only in interfaces.
	 */
//	default void print() {
//		
//	}
	
	public static void main(String[] args) {
		Test.print();
	}
}
