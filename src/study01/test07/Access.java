package study01.test07;

class Cat {
	/*
	 * < Plain Old Java Object (POJO) Method >
	 * 
	 * 1) Declare variables privately!
	 * 
	 * 2) Bringing a value?! => "get"
	 * 
	 * 3) Setting a value?! => "set"
	 *     (Don't do anything else including calculation in the "setter" method.)
	 */
	private int age;
	private String name;
	private String type;
	
	public void setAge(int age) {
		// this.age => private int age;
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
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}

public class Access {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(5);
		c.setName("Lucky");
		c.setType("Husky");
		
		System.out.println("Cat's age is : " + c.getAge());
		System.out.println("Cat's name  is : " + c.getName());
		System.out.println("Cat's type is : " + c.getType());
	}
}