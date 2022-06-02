package InterViewQuestion;

public class PalindromNumber {

	public static void main(String[] args) {
		int no=1210;
		int rev=0;
		int pali=no;
		while(no!=0) {
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(pali==rev) {
			System.out.println("palindrom");
		}else {
			System.out.println("not pali");
		}
		

	}

}
