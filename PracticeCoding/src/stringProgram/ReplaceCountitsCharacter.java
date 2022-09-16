package stringProgram;

import java.util.Arrays;

public class ReplaceCountitsCharacter {

	public static void main(String[] args) {
		String s="abca";
		char key='a';
		
		if(s.indexOf(key)==-1) {
			System.out.println("key not avaialble");
			System.exit(0);
		}
		
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]==key) {
				c[i]=String.valueOf(count).charAt(0);
				count++;
			}
		}
		
		System.out.println(Arrays.toString(c));
	}

}
