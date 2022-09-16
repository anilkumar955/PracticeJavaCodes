package Arraylist;

import java.util.Arrays;

public class sumTwoNo {

	public static void main(String[] args) {
		int[] arr= {2,4,6,1};
		sumNo(arr,6);

	}
	
	
	public static void sumNo(int[] arr,int sum) {
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]>sum) {
				j--;
			}else if(arr[i]+arr[j]<sum) {
				i++;
			}else {
				System.out.println(arr[i]+ " "+arr[j]);
				i++;
				j--;
			}
		}
	}
	

}
