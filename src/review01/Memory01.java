package review01;

public class Memory01 {
	public static void main(String[] args) {
		// I made a space. => Heap Memory
		String str1 = new String("123");
		// Java made a space. => Stack Memory
		String str = "123";
		
		System.out.println("123" == "123"); // True
		System.out.println(str == "123"); // True
		System.out.println(str1 == "123"); // False
		System.out.println(str); // 123
		System.out.println(str1); // 123
		System.out.println(str == str1); // False
	}
}
