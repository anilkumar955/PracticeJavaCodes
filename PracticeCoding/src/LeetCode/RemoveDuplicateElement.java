package LeetCode;

public class RemoveDuplicateElement {
	public int remove(int[] num) {
		if(num.length<0) return 0;
		int j=0;
		for(int i=1;i<num.length;i++) {
			if(num[i]!=num[i-1]) {
				num[j]=num[i];
				j++;
				System.out.println(j);
			}
		}
		
		
		
		
		return j;
		
	
	}

	public static void main(String[] args) {
		RemoveDuplicateElement k=new RemoveDuplicateElement();
		int[] num= {1,2,3,1};
		k.remove(num);

	}

}
