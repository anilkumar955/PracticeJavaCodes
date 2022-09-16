
public class alternativeElement {
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6};
		int expected_Num=arr.length+1;
//		System.out.println(expected_Num);
		int totalSum=(expected_Num*(expected_Num+1))/2; 
//		System.out.println(totalSum);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(totalSum-sum);
	}
	
	
	//Different Approach
//	int[] arr= {1,2,3,4,6,7};
//	int xor1=arr[0];
//	for(int i=1;i<arr.length;i++) {
//		xor1=xor1^arr[i];
//	}
//	int xor2=1;
//	for(int i=2;i<=arr.length+1;i++) {
//		xor2=xor2^i;
//	}
//	System.out.println(xor1^xor2);
//	}
//	
	

}
