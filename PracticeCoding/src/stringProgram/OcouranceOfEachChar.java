package stringProgram;

import java.util.HashMap;

import java.util.Map;

public class OcouranceOfEachChar {

	public static void main(String[] args) {
		
		String s="aanni";
		char[] c = s.toCharArray();
		Map<Character,Integer> map = new HashMap();
		for(char ch:c) {
			if(!map.containsKey(ch)){
				map.put(ch, 1);
			}else {
				int value =map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
		
	}

}
