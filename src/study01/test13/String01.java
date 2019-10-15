package study01.test13;

class String2{
	private char[] values;
	
	public String2(String str) {
		this.values = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			this.values[i] = str.charAt(i);
		}
	}
	public int length() {
		return this.values.length;
	}
}

public class String01 {
	public static void main(String[] args) {
		String2 str = new String2("abcdef");
		System.out.println(str.length());
	}
}
