package stringProgram;

import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="abc";String rev="";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+c[i];
		}
		
		System.out.println(rev);
	}
}

		
		