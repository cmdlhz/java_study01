package study01.test06;

public class MethodTest {
	public static void main(String[] args) {
		String str = "1234567";
		int idx = str.indexOf("9");
		// "Index # : -1"
		System.out.println("Index # : " + idx);
		
		String name = "Jo, Kyle, Emily";
		String[] stars = name.split(",");
		for(int i = 0; i < stars.length; i++) {
			System.out.println("Name : " + stars[i]);
		}
	}
}
