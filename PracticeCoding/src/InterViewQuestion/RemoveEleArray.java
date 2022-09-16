package InterViewQuestion;

public class RemoveEleArray {

	public static void main(String[] args) {
		int[] ar= {1,3,4,2,3};
		int[] arr=new int[ar.length];
		int key=3;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=key) {
				arr[i]=ar[i];
			}
			if(arr[i]>0)
			System.out.println(arr[i]);
		}

	}

}
