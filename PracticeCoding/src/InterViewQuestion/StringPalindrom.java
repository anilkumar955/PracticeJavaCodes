package InterViewQuestion;

import java.util.Stack;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String s="ahhga";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(rev)) {
			
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
			
		}
	}
}
		