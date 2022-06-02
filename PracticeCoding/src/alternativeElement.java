
public class alternativeElement {
	
	public static void demo(int[] arr,int num) {
		
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(" "+""+arr[i]);
		}
		
	}
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,9,67,89};
		int num=5;
		demo(arr,5);

	}

}
