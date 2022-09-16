package Arraylist;

public class segrigateNagativepositve {

	public static void main(String[] args) {
		int[] arr= {9,-2,-5,1};
		segri(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}

	}
	public static void segri(int[] arr) {
		
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
//		System.out.println(arr[i]);
	}
	

}
