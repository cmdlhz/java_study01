package study01.test06;

// all different nums!!!

public class MethodTest2 {
	// num #1
	// cares about it. inserts "0" automatically when there's no value.
	int num;
 
	int getNum() {
		// num #2
		System.out.println(num);
		// doesn't care about it. Doesn't insert "0" automatically when there's no value.
		// I'm my father's daughter, not my grandfather's daughter.
		int num = 3;
		System.out.println(num);
		System.out.println(this.num);
		return 1;
	}
	
	public static void main(String[] args) {
		int num;
		// Tells Java where variables are.
		MethodTest2 mt2 = new MethodTest2();
		System.out.println(mt2.num + " in static method");
		mt2.getNum();
	}
}
