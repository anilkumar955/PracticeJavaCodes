
public class addArray {
	public static void main(String[] args) {
		
		int[] a= {3,4,6,2,1};
		int[]b= {5,6,3,2,1,4};
		int sum1=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		for(int j=0;j<b.length;j++) {
			sum1=sum1+b[j];
		}
		int mis=sum1-sum;
		System.out.println(mis);
		
	}
}

	

	
		
		
		
			
		


	