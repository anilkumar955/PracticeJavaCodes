package LeetCode;

public class palindrom {

	public static void main(String[] args) {
		int num=141;
		int actual=num;
		int count=0;
	
		
		if(num<0) {
			System.out.println("not a pali");
		}
		while(num!=0) {
			int digit=num%10;
			count=count*10+digit;
			num=num/10;
		}
		if(actual==count) {
			System.out.println("palindrom no");
		}
		else {
			System.out.println("not palindrom no");
			
		}

	}

}
