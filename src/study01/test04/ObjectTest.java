package study01.test04;

public class ObjectTest {
	int age;
	String name;

	String getStr() {
		return null;
	}
	
	public static void main(String[] args) {
		// If there is no value, "0" is inserted here.
		ObjectTest ot = new ObjectTest();
		System.out.println(ot.getStr());
	}   
}