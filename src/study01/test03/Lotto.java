package study01.test03;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		System.out.println("Please enter a number for lotto.");
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.println("The first number you entered is : " + num1);
		
		int num2 = Integer.parseInt(scan.nextLine());
		System.out.println("The second number you entered is : " + num2);
		
		int num3 = Integer.parseInt(scan.nextLine());
		System.out.println("The third number you entered is : " + num3);
		
		int num4 = Integer.parseInt(scan.nextLine());
		System.out.println("The fourth number you entered is : " + num4);
		
		int num5 = Integer.parseInt(scan.nextLine());
		System.out.println("The fifth number you entered is : " + num5);
		
		int num6 = Integer.parseInt(scan.nextLine());
		System.out.println("The last number you entered is : " + num6);
		
		Random r = new Random();
		System.out.println("This week's numbers are the following: ");
		
		int correctCnt = 0;
		for(int i = 1; i <= 6; i++) {
			// 0 ~ 44 (That's why we need to include "+1")
			int rNum = r.nextInt(45) + 1;
			System.out.println("Number " + i + " : " + rNum);
			if(rNum == num1 || rNum == num2 || rNum == num3 || rNum == num4 || rNum == num5 || rNum == num6) {
				correctCnt ++;
			}
		}
		System.out.println("Total : " + correctCnt);
	}
}
