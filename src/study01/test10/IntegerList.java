package study01.test10;

// Ctrl + Shift + "O"
import java.util.ArrayList;

public class IntegerList {
	public static void main(String[] args) {
		// A line gets created.
		ArrayList<Integer> al = new ArrayList<Integer>();
		/*
		 * ArrayList al = new ArrayList();
		 * is equal to 
		 * ArrayList<Object> al = new ArayList<Object>;
		 * DON'T DO THIS!
		 */
		// adding a new space to the line
		al.add(10);
		// adding another new space
		al.add(20);
		// adding another new space
		al.add(30);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println("INDEX " + i + " - " + al.get(i));
		}
		System.out.println("50 is @ " + al.indexOf(50));
	}
}
