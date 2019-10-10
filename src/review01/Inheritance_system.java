package review01;

public class Inheritance_system {
	// Inheritance(of Object) + Overriding(doesn't return the memory address anymore)
	public String toString() {
		return "No more memory address";
	}
	
	public static void main(String[] args) {
		Inheritance_system is = new Inheritance_system();
		System.out.println(is);
	}
}
