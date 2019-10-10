package review01;

import java.util.Scanner;

public class Recursion {
	static Scanner scan = new Scanner(System.in);
	
	public static void read() {
		System.out.println("Please enter a number: ");
		
		String numStr = scan.nextLine();
		
		try {
			int num = Integer.parseInt(numStr);
		} catch(NumberFormatException nfe) {
			System.out.print("Enter a number!!! ");
			read();
		}
	}
	
	public static void main(String[] args) {
		read();
	}
}
