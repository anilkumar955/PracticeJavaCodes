package InterViewQuestion;

public class MaxValueArray {

	public static void main(String[] args) {
		int[] no= {2,5,1,8,1,9,987};
		int max=0;
		int min=no[0];
		for(int i=0;i<no.length;i++) {
			
			for(int j=i+1;j<no.length;j++) {
				if(min<no[j]) {
					min=no[j];
				}else {
					max=min;
				}
				
			}
			
		}
		System.out.println(max);
	}

}
