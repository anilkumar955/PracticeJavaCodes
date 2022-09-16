package SortIngAlgo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"dkd","ksl","dsflj"};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+ " ");
			}
	
		}

}
