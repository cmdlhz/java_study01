package study01.test06;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter decimals with floats.");
		double d = scan.nextDouble();
		System.out.println(d);
		
		System.out.println("Please enter your age.");
		// When "enter" is pressed, it gets executed all together. => ERROR
		String ageStr = scan.nextLine();
		int age = Integer.parseInt(ageStr);
		System.out.println("Your age : " + age);
	}
}
