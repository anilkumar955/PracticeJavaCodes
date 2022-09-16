package InterViewQuestion;

import java.util.Stack;

public class ReverseSentece {

	public static void main(String[] args) {
		String s="anil kumar dash";
		
		String rev="";
		String[] sp = s.split(" ");
		for(int i=sp.length-1;i>=0;i--) {
			rev=rev+sp[i]+ " ";
			
		}
		System.out.println(rev);

	}

}
