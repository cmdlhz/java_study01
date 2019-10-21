package study01.test15;

class Out{
	public void println(Object obj) {
		System.out.println(obj);
	}
}

public class TestCalc02 extends Out {
	public static void main(String[] args) {
		Out out = new Out();
		out.println("abc");
	}
}
