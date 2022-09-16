package collections;

import java.util.Scanner;

public class copyList {

	public static void main(String[] args) {
		int[] list1=new int[5];
		int[] list2=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the list values");
		for(int i=0;i<list1.length;i++) {
		
			list1[i]=sc.nextInt();
//			System.out.print(list1[i]);
			list2=list1.clone();
			System.out.println(list2[i]);
		}
		

	}

}
