package study01.test11;

interface Promise2 {
	/*
	 * For Interface,
	 * when you don't declare an access modifier, it's PUBLIC!!!!!!!!!
	 * 
	 * Java 1.8기준으로 확 바뀌었음.
	 * -- can't use any other access modifier besides "public".
	 */
	public int test();
	void test1();
}

class Father{
	void test2() {
		
	}
}

public class Interface02 extends Father implements Promise2 {
	/*
	 * Overriding !!!!!!!!!!
	 * Can't use an access modifier that covers less areas.
	 * Must have SAME return type
	 */
	
	// Must be "int" & needs to return an int.
	public int test() {
		return 1;
	}
	public void test1() {
		
	}
	// public, protected > default
	protected void test2() {

	}
}
