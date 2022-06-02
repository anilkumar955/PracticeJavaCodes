
public class BinarySearch_Iterative {
	
	public int search(int[] array,int target) {
		int left=0;
		int right = array.length-1;
		
		while(left<=right) {
			int middle = left+right/2;
			if(array[middle]==target) {
				return middle;
			}
			if(target>array[middle]) {
				 left=middle+1;
			}
			else {
				 right=middle-1;
			}
		}
			
		return -1;
			
	}
	
	public static void main(String[] args) {
		int[] array = {1,3,5,6,7,9};
		BinarySearch_Iterative s=new BinarySearch_Iterative();
		int op = s.search(array,9);
		System.out.print(op);

	}

}
