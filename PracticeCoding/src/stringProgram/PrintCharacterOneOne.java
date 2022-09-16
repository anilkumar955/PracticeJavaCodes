package stringProgram;

import java.util.Scanner;

public class PrintCharacterOneOne {

	public static void main(String[] args) {

		//"anil,divya,srikar,anusha"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String text =sc.nextLine();
	
		String word1=" ";
		String word2=" ";
		String word3=" ";
		int firstComma =text.indexOf(",");
	
		if(firstComma>0) {
			word1 =text.substring(0,firstComma);
			
			int secondComma =text.indexOf("," ,firstComma+1);
			if(secondComma>0) {
				word2=text.substring(firstComma+1,secondComma);
				word3=text.substring(secondComma+1);
			}else {
				word2=text.substring(firstComma+1);
				
			}
		}
	
		else {
			word1=text;
			
		}
			word1=word1.trim();
			word2=word2.trim();
			word3=word3.trim();
			System.out.println(word1);
			System.out.println(word2);
			System.out.println(word3);
	}
}
	
	

	


