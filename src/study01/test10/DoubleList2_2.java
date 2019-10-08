package study01.test10;

// Ctrl + Shift + "O"
import java.util.Random;

public class DoubleList2_2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int fNum = ran.nextInt(100);
		int sNum = ran.nextInt(10);

		System.out.println(ran);
		System.out.println(fNum);
		System.out.println(sNum);
		
		String str = fNum + "." + sNum;
		System.out.println(str + 1);
		
		double db = Double.parseDouble(str);
		System.out.println(db + 1);	
	}
}
