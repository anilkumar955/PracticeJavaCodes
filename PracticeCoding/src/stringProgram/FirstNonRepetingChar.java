package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetingChar {

	public static void main(String[] args) {
		
		String s="bac dab";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			boolean rep=false;
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					rep=true;
					break;
				}
			}if(!rep) {
				sb=sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
	}
	
}
