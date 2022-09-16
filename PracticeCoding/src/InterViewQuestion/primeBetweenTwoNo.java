package InterViewQuestion;

import java.util.Scanner;

public class primeBetweenTwoNo {

	public static void main(String[] args) {
		
		int no=2;
		int no2=10;
		while(no<no2) {
			boolean flag=false;
			for(int i=2;i<=no/2;i++) {
				if(no%i==0) {
					flag=true;
					break;
				}
			}
			if( !flag && no!=0 && no!=1) 
				System.out.println(no+ " ");
			no++;
			
		}
		
	}
	
}

			