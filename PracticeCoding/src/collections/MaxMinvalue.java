package collections;

public class MaxMinvalue {

	public static void main(String[] args) {
		int min=0;
		int[] arr=new int[]{11,5,3,9,9,56,987};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>min) {
				min=arr[i];
			}
		}System.out.println(min);
	}

}
