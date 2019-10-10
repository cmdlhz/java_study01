package study01.test11;

public class ArrayTest01 {
	
	public static void main(String[] args) {
		int [][] nums = new int[4][];
		// ERROR
//		System.out.println(nums[0][1]);
		// 층만 만들었기 때문에 주차 공간이 없음!
		
		nums[0] = new int[3];
		System.out.println(nums[0][1]); // 0
		
		nums[1] = new int[10];
		
		System.out.println("First Floor : " + nums[0].length);
		System.out.println("Second	 Floor : " + nums[1].length);
		
		System.out.println(nums[2]);
		// Reference type이기 때문에 null이 나옴
		// .length를 가질 수 있음
	}
}
