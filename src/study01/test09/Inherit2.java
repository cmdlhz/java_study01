package study01.test09;

//Ctrl + Shift + "O"
import study01.test08.Atom2;

public class Inherit2 extends Atom2{
	public static void main(String[] args) {
		Inherit2 i2 = new Inherit2();
		// ************* ERROR
//		i2.defaultTest2();
		i2.protectedTest2();
		i2.publicTest2();
		
		// JVM's memory address
		System.out.println(i2);
	}
}

/*
 * This also works!
 */
//package study01.test09;
//
//public class Inherit2 extends study01.test08.Atom2{
//	public static void main(String[] args) {
//		Atom a = new  Atpm();
//	}
//}

// Atom() directs "test09".
//

/*
 * This works in the same package with the other one AND in inherited class in another package.
It can be used ANYWHERE!
study01.test09.Inherit2@15db9742
 */