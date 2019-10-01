package study01.test06;

public class MethodTest2_5 {
	String str;
 
	String getNum() {
		// prints out "null"
		System.out.println(str);
		String str;
		return "hello";
	}
	
	public static void main(String[] args) {
		String str;
		MethodTest2_5 mt2 = new MethodTest2_5();
		mt2.getNum();
	}
}
