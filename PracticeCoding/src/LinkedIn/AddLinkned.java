package LinkedIn;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AddLinkned {

	public static void main(String[] args) {
		String S="an12 ku";
		System.out.println(reverseOnlyLetters(S));
		
	}
	 public static String reverseOnlyLetters(String S) {
	        StringBuilder sb = new StringBuilder(S);
	        for (int i = 0, j = S.length() - 1; i < j;) {
	            if (!Character.isLetter(sb.charAt(i))) {
	                ++i;
	            } else if (!Character.isLetter(sb.charAt(j))) {
	                --j;
	            } else {
	                sb.setCharAt(i, S.charAt(j));
	                sb.setCharAt(j--, S.charAt(i++));
	            }
	        }
	        return sb.toString();
	    }
	
	

}
