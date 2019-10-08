package study01.test10;

class FinalFather{
	
}

public class FinalTest3 extends FinalFather {
	final int num = 1;
	
	public static void main(String[] args) {
		FinalTest3 ft = new FinalTest3();
		System.out.println(ft instanceof FinalTest3);
		System.out.println(ft instanceof FinalFather);
		System.out.println(ft instanceof Object);
		
		// FinalFather : a data type
		FinalFather ff = new FinalTest3();
		System.out.println(ff instanceof FinalTest3);
		
		/*
		 * CASE 1
		 */
		// Same data type BUT the value has been changed to the parent's value
//		ff = new FinalFather();
//		System.out.println(ff instanceof FinalTest3);
		
		/*
		 * CASE 2
		 */
		// @casting
		ff = new FinalFather();
		if(ff instanceof FinalTest3) {
			ft = (FinalTest3) ff;
		}
		System.out.println(ff instanceof FinalTest3);
	}
}

/*
true
true
true
true
false
*/