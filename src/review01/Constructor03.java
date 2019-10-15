package review01;

class Parent{
	int a;
	Parent(){
		System.out.println("Parent class");
	}
}

public class Constructor03 extends Parent {
	int b = 3;
	
	Constructor03(){
		System.out.println(b);
		System.out.println(a);
		System.out.println("Child class");
	}
	
	public static void main(String[] args) {
		Constructor03 c3 = new Constructor03();
	}
}
