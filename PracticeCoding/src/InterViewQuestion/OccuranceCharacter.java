package InterViewQuestion;

import java.util.HashMap;
import java.util.Map;

public class OccuranceCharacter {

	public static void main(String[] args) {
		String s="aabbc";
		char[] c=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(c[i])) {
				map.put(c[i], 1);
			}else {
				int value=map.get(c[i]);
				map.put(c[i], value+1);
			}
		}
		
		System.out.println(map);
	}
}
	