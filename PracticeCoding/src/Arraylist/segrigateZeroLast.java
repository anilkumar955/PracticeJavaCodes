package Arraylist;

public class segrigateZeroLast {

	public static void main(String[] args) {
		int[] arr= {6,0,4,0,3};
		segri(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}
	public static void segri(int[] arr) {
		
		
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>0) {
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				
			}
		}
		
	}

}
