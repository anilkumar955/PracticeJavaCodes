package stringProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str = "beautifuleeeafaa   beach";
		char[] c=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(c[i]==c[j] & c[i]!=' ') {
					count++;
				
					c[j]='0';
				}
				
			}
			if(count>1 && c[i]!='0') {
				System.out.println(c[i]);
			}
		
	}
	}
}