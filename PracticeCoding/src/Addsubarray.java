
public class Addsubarray {

	public static void main(String[] args) {
		int[]a= {1,2,-1,-6};
		int maxsum=0;
		int curentsum=0;
		for(int i=0;i<a.length;i++) {
			curentsum=curentsum+a[i]; //0+1=1
			if(curentsum>maxsum) {
				maxsum=curentsum;
				
			}if(curentsum<0) {
				curentsum=0;
				
			}}
		System.out.println(maxsum);
			
		}
		
}
	

