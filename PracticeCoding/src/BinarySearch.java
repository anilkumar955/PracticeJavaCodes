
public class BinarySearch {
	
	public int search(int[]array,int item) {
		return search(array, item, 0, array.length-1);
	}
	public int search(int[]array,int item,int left,int right) {
				
		if(right<left)
			return -1;
		
		int middle = left+right/2;
		if(array[middle]==item) 
			return middle;
		if(item>array[middle]) 
			return search(array, item, middle+1, right);
		
		return search(array, item, left, middle-1);
		
		
	}
	

	public static void main(String[] args) {
		int[]array= {1,4,5,8};
		BinarySearch s = new BinarySearch();
		int op = s.search(array,5);
		
		System.out.print(op);
		
		System.out.println("---------------------------------------------------------------------------");
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		

	}

}
