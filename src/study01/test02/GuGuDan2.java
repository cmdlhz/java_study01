package study01.test02;

public class GuGuDan2 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
//			System.out.println(i + " 단 시작~");
			int max = 10;
			for(int j =1; j<max; j++) {
				System.out.print(i + " x " + j + " = " + (i * j));
				if(j != max-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}