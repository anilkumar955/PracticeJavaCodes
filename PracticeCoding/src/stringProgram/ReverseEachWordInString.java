package stringProgram;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String text =sc.nextLine();
	
		String s="";
		String[] sri =text.split(" ");
		for(String str:sri) {
			String rev=" ";
			for(int i=str.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
			}
			s=s+rev;
		}
		System.out.println(s);
		
	}
	
	
	
}