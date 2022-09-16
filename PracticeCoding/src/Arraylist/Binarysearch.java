package Arraylist;

public class Binarysearch {

	public static void main(String[] args) {
		int[] arr= {2,9,4,6,7};
		System.out.println(binary(arr,7));
		

	}
	public static int binary(int[] arr,int num) {
		
		int start=arr[0];
		int end=arr.length-1;
//		int ans=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]>num) {
				end=mid-1;
			}else if(arr[mid]<num) {
				start=mid+1;
			}else {
//				ans= mid;
				return mid;
			}
		}
		return -1;
//		return ans;
		
	}
	

}
