package study01.test13;

import java.util.HashMap;

public class MapTest01 {
	private String[] keys;
	private String[] values;
	
	public MapTest01() {
		keys = new String[0];
		values = new String[0];
	}
	
	public int size() {
		return this.keys.length;
	}
	
	// How ".put" works
	public void put(String key, String value) {
		// 방번호가 0부터 시작했으므로 사이즈는 +1을 해줘야 하지만
		this.keys = new String[this.keys.length+1];
		this.values = new String[this.values.length+1];
		
		this.keys[this.keys.length-1] = key;
		this.values[this.values.length-1] = value;
	}
	
	public String toString() {
		String rStr = "";
		for(int i=0; i<this.keys.length; i++) {
			rStr += "{" + this.keys[i] + "=" + this.values[i] + ",";
		}
		rStr = rStr.substring(0, rStr.length()-1);
		rStr += "}";
		return rStr;
	}
	
	public static void main(String[] args) {
		MapTest01 mt01 = new MapTest01();
		mt01.put("Age","29");
		System.out.println(mt01);
		
		HashMap<String, String> map01 = new HashMap<String, String>();
		System.out.println(map01.size()); // 0
	}
}