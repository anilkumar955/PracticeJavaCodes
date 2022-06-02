package InterViewQuestion;

import java.util.Scanner;

public class primeBetweenTwoNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1st no");
		int fno = sc.nextInt();
		System.out.println("enter 2nd no");
		int sno = sc.nextInt();
		
		for(int no=fno;no<=sno;no++) {
			int temp=0;
			for(int i=2;i<no-1;i++) {
				if(no%i==0) {
					temp++;
				}
			}if(temp==0) {
				System.out.println(no);
			}
		}
		
	}
}

			