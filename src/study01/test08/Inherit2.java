package study01.test08;

public class Inherit2 extends Atom2{
	public static void main(String[] args) {
		Inherit2 i2 = new Inherit2();
		
		i2.defaultTest2();
		i2.protectedTest2();
		i2.publicTest2();
	}
}

/*
 * This works only in the same package.
This works in the same package with the other one AND in inherited class in another package.
It can be used ANYWHERE!

 */