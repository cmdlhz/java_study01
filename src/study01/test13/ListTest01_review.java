package study01.test13;

public class ListTest01_review {
	private String[] strs;
	
	public ListTest01_review() {
		this.strs = new String[0];
	}
	
	public static void main(String[] args) {
		ListTest01_review test = new ListTest01_review();
		System.out.println(test.size());
		
		test.add("a");
		test.add("b");
		test.add("c");
		System.out.println(test.size());
		
		String strList= "[";
		for(int i=0; i<test.size(); i++) {
			strList += test.strs[i] + ",";
		}
		strList = strList.substring(0, strList.length()-1);
		strList += "]";
		
		System.out.println(strList);
	}
	public void add(String str) {
		String []temp = this.strs;
		
		this.strs = new String[this.strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		
		for(int i = 0; i < temp.length; i++) {
			this.strs[i] = temp[i];
		}
	}
	public int size() {
		return this.strs.length;
	}
}
