package review01;

// Ctrl + Shift + "O"
import java.util.Random;

public class Default01 {
	int age;
	String name;
	Random r;
	
	public static void main(String[] args) {
		Default01 dt = new Default01();
		
		System.out.println(dt.age);
		System.out.println(dt.name);
		// Runtime Exception
		System.out.println(dt.r.nextInt());
	}
}
