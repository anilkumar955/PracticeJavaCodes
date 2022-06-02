import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s="abcd";
		String s1="aCdb";
		
		char[] c=s.toLowerCase().toCharArray();
		char[] d=s1.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		boolean result = Arrays.equals(c,d);

	      if(result) {
	        System.out.println("anagram.");
	      }
	      else {
	        System.out.println( " are not anagram.");
	      }
	}
	   
				

		
	
}