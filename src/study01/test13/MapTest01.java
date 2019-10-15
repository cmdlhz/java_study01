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
		// value를 추가하기 위해서 공간부터 늘려줘야 함
		this.keys = new String[this.keys.length+1];
		this.values = new String[this.values.length+1];
		
		// Insert the new value to the last index
		this.keys[this.keys.length-1] = key;
		this.values[this.values.length-1] = value;
	}
	
	public String toString() {
		String rStr = "";
		for(int i=0; i<this.keys.length; i++) {
			rStr += "{" + this.keys[i] + "=" + this.values[i] + "}, ";
		}
		rStr = rStr.substring(0, rStr.length()-1);
//		rStr += "}";
		return rStr;
	}
	
	public static void main(String[] args) {
		MapTest01 mt01 = new MapTest01();
		mt01.put("Age","29");
		mt01.put("Age","33");
		mt01.put("Age","25");
		System.out.println(mt01);
		
		HashMap<String, String> map01 = new HashMap<String, String>();
		System.out.println(map01.size()); // 0
	}
}