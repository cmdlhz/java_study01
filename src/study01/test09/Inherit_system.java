package study01.test09;

public class Inherit_system {
	// Inheritance + Overriding(doesn't return the memory address)
	public String toString() {
		return "No more memory address!";
	}
	
	public static void main(String[] args) {
		Inherit_system is = new Inherit_system();
		System.out.println(is);
	}
}
