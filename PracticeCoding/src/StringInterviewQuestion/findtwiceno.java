package StringInterviewQuestion;

public class findtwiceno {

	public static void main(String[] args) {
		int[] no= {1,3,1,4,3};
		int first=no[0];
		int count=0;
		for(int i=0;i<no.length;i++) {
			if(first==no[i]) {
				count++;
				first=no[i];
			}
			if(count==2) {
				System.out.println(no[i]);
			}
		}

	}

}
