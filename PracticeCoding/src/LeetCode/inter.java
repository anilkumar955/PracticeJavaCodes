package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class inter {

	public static void main(String[] args) {
		
		
		
			Scanner sc=new Scanner(System.in);
//			System.out.println("enter first word");
			 String x=sc.nextLine()+" "; 
//			 System.out.println("enter end word");
			 String y = sc.nextLine(); 
			
			String z =x.concat(y);
			
			int len=z.length();
			System.out.println(len);
			

		    if(x.compareTo(y) > 0){
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		 
		    	
		    	System.out.println(x.substring(0,1).toUpperCase()+x.substring(1,x.length())+ " "+y.substring(0,1).toUpperCase()+y.substring(1,y.length()));
		    
	}
		
		
	}


