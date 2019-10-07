package study01.test08;

class Atom3{
	private void privateTest3() {
		System.out.println("You can use it only in the same class.");
	}
	void defaultTest3() {
		privateTest3();
		System.out.println("This works only in the same package.");
	}
	protected void protectedTest3() {
		System.out.println("This works in the same package with the other one AND in inherited class in another package.");
	}
	public void publicTest3() {
		System.out.println("It can be used ANYWHERE!");
	}
}

public class Inherit3 extends Atom3{
	public static void main(String[] args) {
		Inherit3 i3 = new Inherit3();
		
		i3.defaultTest3();
		i3.protectedTest3();
		i3.publicTest3();
		/*
		 * Impossible!
		 */
//		i3.privateTest3();
	}
}