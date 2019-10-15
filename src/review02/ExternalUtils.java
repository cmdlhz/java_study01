package review02;

// Ctrl + Shift + "O"
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class ExternalUtils {
	public static void main(String[] args) {
		List<String> ages = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			System.out.println("Please enter your age : ");
			String age = scan.nextLine();
			// "leftpad" : "static" method
			age = StringUtils.leftPad(age, 3, "0");
			ages.add(age);
		}
		Collections.sort(ages);
		for(int i=0; i<ages.size(); i++) {
			System.out.println(ages.get(i));
		}
	}
}
