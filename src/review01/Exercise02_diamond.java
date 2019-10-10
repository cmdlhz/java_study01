package review01;

// Ctrl + Shift + "O"
import java.util.Scanner;

public class Exercise02_diamond {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Get a number from a user. (if it's "5")
		System.out.println("Enter the number of rows needed to print the pattern");
		int rows = scanner.nextInt();
		
		/*
		 * TOP
		 */
		for(int i=1; i<=rows; i++) {
			// Print spaces in a decreasing order. 
			for(int j=rows; j>i; j--) {
				System.out.print(" "); //  (4-3-2-1)
			}
			// Print stars in an increasing order. 
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*"); // (1-3-5-7-9)
			}
			System.out.println();
		}
		
		/*
		 * BOTTOM
		 */
		for(int i=rows-1; i>=1; i--) {
			// Print spaces in an increasing order. 
			for(int j=rows-1; j>=i; j--) {
				System.out.print(" "); // (4-3-2-1)
			}
			// Print stars in a decreasing order. 
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*"); // (7-5-3-1)
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
