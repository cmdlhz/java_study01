package review01_practice;

class Cat{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class Access01_p {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(5);
		c.setName("Lucky");
		
		System.out.println(c.getAge());
		System.out.println(c.getName());
	}
}
