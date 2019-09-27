package study01.test02;

public class ArrayTest {
	public static void main(String[] args) {
		String[] names = {"Marks", "Sam", "Jane"};
//		System.out.println(names[0]);
		
		int money1 = 0;
		int money2 = 100;
		int money3 = 500;
		int money4 = 200;
		
		int [] moneyCollection = new int[4];
		moneyCollection[0] = money1;
		moneyCollection[1] = money2;
		moneyCollection[2] = money3;
		moneyCollection[3] = money4;
		
		double[] dbs = new double[5];
		
//		System.out.println(moneyCollection.length);
		
		for(int i =0; i < 4; i++) {
			System.out.println(i  + " - " + moneyCollection[i]);
		}
	}
}
