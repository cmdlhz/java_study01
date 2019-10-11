package study01.test03;

public class Increment {
	 public static void main(String[] args) {
		 int num = 1;
//		 num = num + 1;
//		 num += 1;
//		 num ++;
		 
		 // Increment after the execution
		 System.out.println(num++);
		 // Now, it's increased.
		 System.out.println(num);
		 // Increment at the time of execution
		 System.out.println(++num);
		 // Same
		 System.out.println(num);
		 
//		 for(int i = 1; i <= 10; i++) {
//			 System.out.println(i);
//		 }
	 }
}
