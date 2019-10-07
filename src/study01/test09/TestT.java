package study01.test09;

class Food{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// annotation
	@Override
	public String toString() {
		return "Food [name =" + name + " & price =" + price + "]";
	}
}

public class TestT {
	public static void main(String[] args) {
		Food f = new Food();
		f.setName("Chicken");
		f.setPrice(15000);
		System.out.println(f);
	}
}
