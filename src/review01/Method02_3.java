package review01;

public class Method02_3 {
	int num;
	
	int getNum() {
		System.out.println(num);
		int num = 3;
		System.out.println(this.num);
		System.out.println(num); 
		return 1;
	}
	
	public static void main(String[] args) {
		int num = 5;
		Method02_3 mt = new Method02_3();
		System.out.println(mt.num + " in a static method.");
		mt.getNum();
		System.out.println(num); 
	}
}