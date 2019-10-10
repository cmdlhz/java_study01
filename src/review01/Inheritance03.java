package review01;

class Cat3 {
	public void sleep() {
		System.out.println("A Cat3 is sleeping.");
	}
}

public class Inheritance03 extends Cat3 {
	public void sleep() {
		System.out.println("A KoShort Cat3 is sleeping");
	}
	public static void main(String[] args) {
		Cat3 c = new Inheritance03();
		Cat3[] cats = new Cat3[3];
		
		cats[0] = new Cat3();
		cats[1] = new Inheritance03();
		
		cats[0].sleep();
		cats[1].sleep();
	}
}
