package review01;

import java.util.Random;

public class parseDouble02 {
	public static void main(String[] args) {
		Random r = new Random();
		int fNum = r.nextInt(100);
		int sNum = r.nextInt(10);
		
		System.out.println(r);
		System.out.println(fNum);
		System.out.println(sNum);
		
		String str = fNum + "." + sNum;
		System.out.println(str + 1);
		
		double db = Double.parseDouble(str);
		System.out.println(db + 1);
	}
}
