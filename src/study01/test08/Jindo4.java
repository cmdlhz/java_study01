package study01.test08;

// Class Animal inherits an object (by Java)
class Animal4{
	
}

class Dog4 extends Animal4{
	
}

public class Jindo4 extends Dog4{
	public static void main(String[] args) {
		Animal4 a4 = new Jindo4();
		Object o4 = new Jindo4();
	}
}
/*
 * Jindo = a dog
 * A dog = an animal
 * 
 * A dog is NOT equal to "Jindo".
 * An animal is NOT equal to "Dog".
 * 
 */

// Jindo4 can be called in 4 ways : Jindo4, Dog4, Animal4, Object