package study01.test08;

class Cat{
	public void sleep() {
		System.out.println("A cat is sleeping.");
	}
}

public class KoShort extends Cat{
	public void sleep() {
		System.out.println("A KoShort cat is sleeping.");
	}
	public static void main(String[] args) {
		Cat c = new KoShort();
		Cat[] cats = new Cat[4];
		
		cats[0] = new Cat();
		cats[1] = new KoShort();
		
		cats[0].sleep();
		cats[1].sleep();
	}
}
