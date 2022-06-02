package InterViewQuestion;

public class SumofTwo {

	public static void main(String[] args) {
		int target=9;
		boolean match=false;
		int[] no= {3,4,5,1};
		for(int i =0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]+no[j]==target) {
					System.out.print(no[i] +","+ no[j]);
				}
			}
			
		}

	}

}
