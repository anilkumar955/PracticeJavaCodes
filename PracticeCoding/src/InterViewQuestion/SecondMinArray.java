package InterViewQuestion;

public class SecondMinArray {

	public static void main(String[] args) {
		int[] no= {35,4,9,2,5,1,98,34};
		int temp=0;
		for(int i=0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]>no[j]) {   //for 2nd max value Change < 
					temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
			}
		}
System.out.println(no[1]);
	}

}
