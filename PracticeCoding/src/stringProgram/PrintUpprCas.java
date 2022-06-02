package stringProgram;

import java.util.Scanner;

public class PrintUpprCas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String v =sc.next();
		String n=" ";
//		System.out.println(v);
		int count=0;
		for(int i=0;i<v.length();i++) {
			
			char c =v.charAt(i);
			if(Character.isUpperCase(c)) {
				
				n=n+c;
				
				count++;
				
				
			}
			
		}
		System.out.println(n);
		System.out.println("count of upper case :"+ " " +count);
	}
}