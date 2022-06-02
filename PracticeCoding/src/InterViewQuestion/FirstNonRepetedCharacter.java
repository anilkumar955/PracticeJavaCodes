package InterViewQuestion;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepetedCharacter {

	public static void main(String[] args) {
		String s="bbaai";
		StringBuffer sb = new StringBuffer();
//		char[] c =s.toCharArray();
//		Set<Character> set=new HashSet();
		for(int i=0;i<s.length();i++) {
			boolean rep=false;
//			set.add(c[i]);
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					rep=true;
					
				}
			}
			if(!rep) {
				sb.append(s.charAt(i));
			
				System.out.println(sb);
				break;
			}
			
		}

	}

}
