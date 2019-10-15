package review01;

public class GetSet {

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
	
	public static void main(String[] args) {
		GetSet c = new GetSet();
		
		c.setAge(5);
		c.setName("Lucky");
		
		System.out.println(c.getAge());
		System.out.println(c.getName());
	}
}
