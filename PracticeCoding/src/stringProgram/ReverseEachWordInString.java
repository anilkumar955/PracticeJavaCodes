package stringProgram;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String text =sc.nextLine();
		String a="";
		String[] s=text.split(" ");
		for(String sp:s) {
			String rev=" ";
			for(int i=sp.length()-1;i>=0;i--) {
				rev=rev+sp.charAt(i);
			}
			a=a+rev;
		}
	System.out.println(a);
		
	}
	
	
	
}