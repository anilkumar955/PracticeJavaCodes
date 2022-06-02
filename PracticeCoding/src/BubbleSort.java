import java.util.Arrays;

public class BubbleSort {
	public void sort(int[]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					
					
					
				}
			}
		}
		
	}
	private void swap(int[] a,int index1,int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2]=temp;
		
	}

	public static void main(String[] args) {
		int[] a = {4,1,5,2,9,10,7};
		BubbleSort b = new BubbleSort();
		b.sort(a);
		System.out.print(Arrays.toString(a));
				
		
		

	}
	

}
