package InterViewQuestion;

public class FibonaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int lno=10;
		for(int i=0;i<lno;i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(a);
		}
		
	}
	
}
	