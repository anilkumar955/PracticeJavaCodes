package InterViewQuestion;

public class FibonaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int num=9;
		for(int i=0;i<=num;i++) {
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
			
		}
		
		
	}

}
