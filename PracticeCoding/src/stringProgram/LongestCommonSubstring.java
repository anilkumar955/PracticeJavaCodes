package stringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String s="abca";
		String longeststring=null;
		int longestleng=0;
		char[] c=s.toCharArray();
		Map<Character,Integer> map=new HashMap();
		for(int i=0;i<c.length;i++){
			char ch=c[i];
			if(!map.containsKey(ch)){
				map.put(ch,i);
			}else{
				i=map.get(ch);
				map.clear();
			}
		if(longestleng<map.size()){
			longestleng=map.size();
			longeststring=map.keySet().toString();
		}
		}
			System.out.println(longeststring);
			System.out.println(longestleng);
		
		
	}
}
