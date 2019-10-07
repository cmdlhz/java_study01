package study01.test08;

public class Atom2{
	private void privateTest2() {
		System.out.println("You can use it only in the same class.");
	}
	void defaultTest2() {
		System.out.println("This works only in the same package.");
	}
	protected void protectedTest2() {
		System.out.println("This works in the same package with the other one AND in inherited class in another package.");
	}
	public void publicTest2() {
		System.out.println("It can be used ANYWHERE!");
	}
}
