package study01.test03;

import java.util.Scanner;

public class HowOldRU {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		String age = scan.nextLine();
		System.out.println("I 'm " + age + " years old.");
		int num = Integer.parseInt(age);
		System.out.println(age);
	}
}
