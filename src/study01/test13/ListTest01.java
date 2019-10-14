package study01.test13;

public class ListTest01 {
	private String[] strs;
	
	//@생성자
	public ListTest01() {
		// null + 1을 할 수 없으니까
		// Exception in thread "main" java.lang.NullPointerException
		this.strs = new String[0];
	}
	
	public int size() {
		return this.strs.length;
	}
	
	public void add(String str) {
		// **********
		String[] tempStr = this.strs;
		
		// 방 개수 증가
		// Java에서는 [] 에서 variable을 사용해서 연산이 가능함
		this.strs = new String[this.strs.length + 1];
		// 마지막 index에 값 추가
		this.strs[this.strs.length - 1] = str;
		
		// **********
		for(int i=0; i<tempStr.length; i++) {
			this.strs[i] = tempStr[i];
		}
		
		// ********** 이 두가지가 없으면 밑에 null, null, c 가 나옴
	}
	
	public void remove(String str) {
		
	}
	
	public static void main(String[] args) {
		ListTest01 test = new ListTest01();
		System.out.println(test.size()); // 0
		
		test.add("a");
		test.add("b");
		test.add("c");
		System.out.println(test.size()); // 3

		System.out.println(test.strs[0]); // a
		System.out.println(test.strs[1]); // b
		System.out.println(test.strs[2]); // c
		
		System.out.println(test); // study01.test13.ListTest01@15db9742
	}
}