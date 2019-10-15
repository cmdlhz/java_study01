package study01.test13;

public class ListTest03 {
	private String[] strs;

	public ListTest03() {
		this.strs = new String[0];
	}
	
	public int size() {
		return this.strs.length;
	}
	
	public void add(String str) {
		String[] tempStr = this.strs;
		
		this.strs = new String[this.strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		
		for(int i=0; i<tempStr.length; i++) {
			this.strs[i] = tempStr[i];
		}
	}
	
	public int indexOf(String str) {
		for(int i=0; i<strs.length; i++) {
			if(str.equals(strs[i])) return i;
		}
		// 못 찾았으므로 -1을 return
		return -1;
	}
	
	public void remove(String str) {
		int num = indexOf(str);
		if(num != -1) remove(num);
	}

	public void remove(int num) {
		String[] tempStr2 = this.strs;
		this.strs = new String[this.strs.length - 1];
		
		for(int i=0; i<num; i++) {
			this.strs[i] = tempStr2[i];
		}
 		for(int i=num + 1; i<tempStr2.length; i++) {
			this.strs[i - 1] = tempStr2[i];
		}
	}
	
	public static void main(String[] args) {
		ListTest03 test = new ListTest03();
		System.out.println(test.size()); // 0
		
		test.add("a");
		test.add("b");
		test.add("c");
		System.out.println(test.size()); // 3
		
		test.remove(1); // [a,c]
		test.remove("d"); // [a,c]
		
		String str = "[";
		for(int i =0; i < test.size(); i++) {
			str += test.strs[i] + ",";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		
		System.out.println(str);
	}
}