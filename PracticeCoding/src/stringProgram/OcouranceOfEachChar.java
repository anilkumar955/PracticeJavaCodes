package stringProgram;

import java.util.HashMap;


import java.util.Map;



public class OcouranceOfEachChar {

	public static void main(String[] args) {
		
		String s="aanni";
		char[] c=s.toCharArray();
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(char ch:c) {
			if(!m.containsKey(ch)) {
				m.put(ch, 1);
			}else {
				int value=m.get(ch);
				m.put(ch, value+1);
			}
			
			
		}
		System.out.println(m);
		
	}

}
