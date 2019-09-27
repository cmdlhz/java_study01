package study01.test02;

public class NumberDataType {
	public static void main(String[] args) {
		// smallest
		byte b = 127;
		// larger than byte
		short s = 128;
		// larger than short
		int i = 10000;
		// largest among types storing integers
		long l = 10000000;
		
		byte b2 = 1;
		short s2 = b;
		// b = s는 불가능 (물통 크기가 다르다!)
		
		double d = 1.33;
		float f = 0.33f;
	}
}