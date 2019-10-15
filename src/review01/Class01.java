package review01;

class Father{
	// STEP #3
	public Father() {
		System.out.println("Father");
	}
}

public class Class01 extends Father {
	// STEP #2
	public Class01() {
		System.out.println("Constructor");
	}
	// STEP #5
	public void a() {
		System.out.println("Son");
	}
	public static void main(String[] args) {
		// STEP #1
		Father t = new Class01();
		// STEP #4
		((Class01)t).a();
	}
}
