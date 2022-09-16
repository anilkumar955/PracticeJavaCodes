package InterViewQuestion;

import java.util.Arrays;

public class MinvalueArray {

	public static void main(String[] args) {
		int[] no= {7,9,5,2,10,1,100};
		
		for(int i=0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]>no[j]) {
					int temp=no[i];
					no[i]=no[j];
					no[j]=temp;
					
				}
			}
			
		}
		
		System.out.println(no[0]);
	}
	

}
