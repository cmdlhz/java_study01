package study01.test03;

import java.util.Scanner;

public class HowOldRU {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		String age = scan.nextLine();
		System.out.println("I 'm " + age + " years old.");
		try {
			int num = Integer.parseInt(age);
			if(num > 0 && num <= 10) {
				System.out.println("You're a child.");
			} else if(num <=20) {
				System.out.println("You're a teenager.");
			} else if(num <= 40) {
				System.out.println("You're an adult.");
			} else if(num <= 0) {
				System.out.println("Please enter a valid age.");
			} else {
				System.out.println("You're very old!!");
			}
		} catch(Exception e) {
			System.out.println("Please enter in numbers.");
		}
	}
}
