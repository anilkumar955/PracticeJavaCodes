package InterViewQuestion;

import java.util.Stack;

public class ReverseSentece {

	public static void main(String[] args) {
		String s="anil kumar dash";
		
		String rev="";
		String[] sp = s.split(" ");
		for(int i=0;i<sp.length;i++) {
			rev=sp[i]+" "+rev;
			
		}
		System.out.println(rev);

	}

}
