package study01.test04;

import java.util.Random;

public class ObjectTestNoValues {
	int age;
	String name;
	Random r;
	
	public static void main(String[] args) {
		// If there is no value, "0" is inserted here.
		ObjectTest ot = new ObjectTest();
		System.out.println(ot.age); 
		// "0"
		System.out.println(ot.name); 
		// "null"
		// Runtime Exception
		System.out.println(ot.r.nextInt());
	}   
}