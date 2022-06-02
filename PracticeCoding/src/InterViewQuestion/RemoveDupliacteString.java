package InterViewQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliacteString {

	public static void main(String[] args) {
		String s="aanill";
//		char[] c =s.toCharArray();
//		boolean rep=false;
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<s.length();i++) {
//			char c =s.charAt(i);
//			int idx =s.indexOf(c,i+1);
//			if(idx==-1) {
//				sb.append(c);
//			}
//		}
//		
//		System.out.println(sb);
//	}
//
//}

//2nd approach
//		String s="aanill";
//		char[] c =s.toCharArray();
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<s.length();i++) {
//			boolean rep=false;
//			for(int j=i+1;j<s.length();j++) {
//				if(c[i]==c[j]) {
//					rep=true;
//					break;
//				}
//			}
//		
//		if(!rep) {
//			sb.append(c[i]);
//		}
//	}System.out.println(sb);
//	}
//}
		
//3rd approach
		
		StringBuffer sb=new StringBuffer();
		Set<Character> set= new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character c:set) {
			sb.append(c);
		}
		
		System.out.println(sb);
		
	}
}


