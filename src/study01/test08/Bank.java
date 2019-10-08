package study01.test08;

public class Bank {
	private int money;
	private int totalMoney;
	
	private void inputMoney() {
		this.totalMoney += money;
	}
	public void setMoney(int money) {
		this.money = money;
		inputMoney();
	}
	 
	/*
	 * Without @Override, the memory location is displayed.
	 * study01.test08.Bank@15db9742
	 */
	
	@Override
	public String toString() {
		return "The total : " + this.totalMoney;
	}
	
	// Only depositing money is available.
	/*
	 * static : creates a default constructor
	 * When there's no "static", a default constructor is created. And then it creates a default constructor. And then... gets repeated FOREVER.
	 */
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setMoney(200);
		b.setMoney(3000);
		System.out.println(b);
	}
}
