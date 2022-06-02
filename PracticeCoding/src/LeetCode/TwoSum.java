package LeetCode;

import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
//		String[] name={"anil","anoi","anvss"};
//	String pre= name[0];
//	for(int i=1 ;i<name.length;i++) {
//		while(name[i].indexOf(pre)!=0) {
//			pre=pre.substring(0,pre.length()-1);
//		}
//	}
//	System.out.println(pre);

		int[] no = {1,3,4,9,7};
		int target=17;
		for(int i=0;i<no.length-1;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]+no[j]==target) 
					System.out.println(no[i]+","+no[j]);
					
				
			}
			}
		}
		
		
		
	
}
