package LeetCode;

public class plusOne {
	public static void main(String[] args) {
		int[] num= {1,2,3,2};
		for(int i=num.length-1;i>0;i--) {
			if(num[i]!=9) {
			
			num[i]++;
			
			break;}
			else {
				num[i]=0;
			}
		}
		
		if(num[0]==0) {
			int[] res=new int[num.length+1];
			num[0]=1;
			System.out.println(res);
		}
		System.out.println(num);
	
		
	}
}