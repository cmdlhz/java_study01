package study01.test13;

public class ListTest01_review {
	private String[] strs;
	
	public ListTest01_review() {
		this.strs = new String[0];
	}
	
	public int size() {
		return this.strs.length;
	}
	
	public void add(String str) {
		String[] tempStr = this.strs;
		
		this.strs = new String[this.strs.length+1];
		this.strs[this.strs.length-1] = str;
		
		for(int i=0; i<tempStr.length; i++) {
			this.strs[i] = tempStr[i];
		}
	}
	
	public static void main(String[] args) {
		ListTest01_review r = new ListTest01_review();
		System.out.println(r.size());
		
		r.add("a");
		r.add("b");
		r.add("c");
		System.out.println(r.size());
		
		System.out.println(r.strs[0]);
	}
}
