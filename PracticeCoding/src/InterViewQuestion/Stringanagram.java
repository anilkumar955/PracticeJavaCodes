package InterViewQuestion;

import java.util.Arrays;

public class Stringanagram {

	public static void main(String[] args) {
		String a= "race";
		String b = "Care";
		boolean status=false;
		boolean flag=false;
		if(a.length()!=b.length()) {
			status=false;
		}else {
			char[] c =a.toLowerCase().toCharArray();
			char[] d =b.toLowerCase().toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			status =Arrays.equals(c, d);
		}
		if(status) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}

}
