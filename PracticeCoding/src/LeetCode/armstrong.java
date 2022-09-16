package LeetCode;

public class armstrong {
	
	public static void main(String[] args) {
		int num1=1;int num2=200;

	      for (int i = num1; i<num2; i++){
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = (int) (sum + Math.pow(rem, 3));
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(""+i+" is an Armstrong number.");
	         }
	      }
	   }
	}