
public class bubble {

	public static void main(String[] args) {
		int temp=0;
		int flag=0;
		int[] a = {2,53,23,66,11};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}
							
				