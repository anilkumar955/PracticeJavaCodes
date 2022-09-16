package stringProgram;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "baa ba";
		StringBuffer sb= new StringBuffer();
		
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					flag=true;
				}
			}
			if(!flag) {
				sb=sb.append(c[i]);
			}
			
			
		}
		System.out.println(sb);	
	
	}
}
