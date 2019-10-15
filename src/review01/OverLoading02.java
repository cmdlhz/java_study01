package review01;

interface Promise{
	public int test();
	void test01();
}

class FatherP{
	void test02() {
		
	}
}

public class OverLoading02 extends FatherP implements Promise{
	public int test() {
		return 1;
	}
	public void test01() {
		
	}
	/*
	 * Overriding can't cover less areas.
	 * = Cannot reduce the visibility of the inherited method from FatherP
	 */
	// public, protected > default
	protected void test02() {
		
	}
}