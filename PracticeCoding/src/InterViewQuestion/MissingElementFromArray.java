package InterViewQuestion;

public class MissingElementFromArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		int expectedNum=arr.length+1;
//		System.out.println(expectedNum);
		int totalSum=expectedNum*(expectedNum+1)/2;
//		System.out.println(totalSum);
		int num=0;
		for(int i=0;i<arr.length;i++) {
			num=num+arr[i];
		}
		
		int misingNum=totalSum-num;
		System.out.println(misingNum);
	}

}
