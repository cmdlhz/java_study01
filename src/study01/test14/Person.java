package study01.test14;

public class Person {
	private String name;
	private int age;
	private String addr;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
	
	//@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + ", addr = " + addr + "]";
	}
	
	public static void main(String[] args) {

	}
}
