package InterViewQuestion;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		int no=5;
		int temp=0;
		for(int i=2;i<no-1;i++) {
			if(no%i==0) {
				temp++;
			}
		}if(temp==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}
}