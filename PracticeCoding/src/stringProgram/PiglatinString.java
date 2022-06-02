package stringProgram;

import java.util.Scanner;

public class PiglatinString {

	public static void main(String[] args) {
	
		//Add way last of the string 
		//if any vouwel come then break before the vowel and add previous string after vowel with AY
		String n="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s =sc.next();
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			char u =Character.toUpperCase(c);
			if(u=='A' || u=='E' || u=='I' ||  u=='O' || u=='U') {
				if(i==0) 
					n=s+"WAY";
				else 
					n=s.substring(i)+s.substring(0,i)+"AY";
				break;
			}
		}
					
		System.out.println(n);
			
		

	}

}
