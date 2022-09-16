package Arraylist;

public class FindUniqueno {
	
	
	public static void main(String[] args) {
		int[] arr= {3,2,5,2,3};
		unique(arr);
		
	}
	
	public static void unique(int[] arr) {
		
		int x=0;
		for(int i=0;i<arr.length;i++) {
			x=x^arr[i];
		}
		System.out.println(x);
	}

}
