package collections;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		
		int[] no=new int[10]; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		
//		int[] no= {2,3,4,2,2,4,2,2,2,2};
		int count=0;
		for(int i=0;i<no.length;i++) {
			no[i]=sc.nextInt();
			count=count+no[i];
			
		}
		System.out.println(count);
	}

}
