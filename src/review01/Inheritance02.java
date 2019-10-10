package review01;

// Class Animal inherits an object (created by Java)
class Animal{
	public void type() {
		System.out.println("I'm an animal!");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Grrrrrr");
	}
}

public class Inheritance02 extends Dog{
	public static void main(String[] args) {
		Animal a = new Inheritance02();
		Object o = new Inheritance02();
		Dog d = new Inheritance02();
		
		d.bark();
		a.type();
	}
}

/*
 * Inheritance2 = a dog
 * A dog = an animal
 * 
 * A dog is NOT equal to "Inheritance2"
 * An animal is NOT equal to "Dog".
 */