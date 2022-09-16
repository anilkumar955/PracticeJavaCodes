import java.util.Arrays;

public class maxminElementArray {

	public static void main(String[] args) {
		int max =Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		int[]array= {-9,-10,3,2};
		
		int size= array.length;
		for(int i =0;i<size;i++) {
			if(array[i]>max){
				max = array[i];		
			
		System.out.println("MAX value from the array is:"+ max);}
			if(array[i]<size) {
				min = array[i];}
				System.out.println("MAX value from the array is:"+ min);
		}
			}
	
		
	}
	

	
