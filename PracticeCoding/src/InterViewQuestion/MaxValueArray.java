package InterViewQuestion;

import java.util.Arrays;

public class MaxValueArray {

	public static void main(String[] args) {
		
		int[] a= {5,3,24,1,9};
		int max=a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		
		
	}
}