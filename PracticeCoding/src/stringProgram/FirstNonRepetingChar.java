package stringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepetingChar {

	public static void main(String[] args) {
		String s ="bbanniial";
		for(int i=0;i<s.length();i++) {
			boolean repeate=false;
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					repeate=true;
					break;
				}
			}
			if(!repeate) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}				
			
	
		
		
		// second approach
		
//	Map<Character , Integer> map = new HashMap();
//	
//	for(int i=0;i<s.length();i++) {
//		char c = s.charAt(i);
//		
//		if(map.containsKey(c)) {
//			map.put(c, map.get(c)+1);
//		}
//		else {
//			map.put(c, 1);
//			
//		}
//	}
//	System.out.println(map);
//	for(Entry<Character, Integer> entryset:map.entrySet()) {
//		if(entryset.getValue()==1) {
//			System.out.println(entryset.getKey());
//		}
//	}
//	}
			