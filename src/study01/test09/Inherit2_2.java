package study01.test09;

import study01.test08.Atom2;

public class Inherit2_2 extends Atom2 {
	static void test(Object i) {
		
	}
	public static void main(String[] args) {
		Object o2 = new Inherit2_2();
		System.out.println(new Inherit2_2());
		
		// It's possible. But, don't code like this! 
		Object obj = 1;
		obj = "1";
		obj = true;
		obj = new Atom2();
		obj = new Inherit2_2();
		
		// The reason that anything can be include in "println()" is everything is an object.
		System.out.println(obj);
	}
}
