package review01;

class FinalFather {

}

public class Casting01 extends FinalFather {
	final int num = 1;
	
	public static void main(String[] args) {
		Casting01 c1 = new Casting01();
		
		System.out.println("===== c1 & Casting01 =====");
		System.out.println(c1 instanceof Casting01);
		
		System.out.println("===== c1 & FinalFather =====");
		System.out.println(c1 instanceof FinalFather);
		
		System.out.println("===== c1 & FinalFather =====");
		System.out.println(c1 instanceof Object);
		
		FinalFather f1 = new Casting01();
		
		System.out.println("===== f1 & Casting01 (new Casting01) =====");
		System.out.println(f1 instanceof Casting01);
		
		f1 = new FinalFather();
		
		System.out.println("===== f1 & Casting01  (new FinalFather) =====");
		System.out.println(f1 instanceof Casting01);
		
		// @casting
		if(f1 instanceof Casting01) {
			c1 = (Casting01) f1;
			System.out.println("Casting --- completed");
		}
		System.out.println("===== casting =====");
		System.out.println(f1 instanceof Casting01);
	}
}