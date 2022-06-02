package LeetCode;

public class AddMaxSub {
	
	public static void main(String[] args) {
		int[] num= {1,2,-5,3};
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			max=Math.max(sum, max);
			if(sum<0)
				sum=0;
		}
		System.out.println( max);
	}

}
