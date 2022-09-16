package StringInterviewQuestion;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int no=9;
		for(int i=0;i<no;i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(a);
		}
		
		
	}
	
}