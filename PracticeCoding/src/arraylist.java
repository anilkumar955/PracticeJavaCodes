import java.util.ArrayList;
import java.util.Iterator;


public class arraylist {

	public static void main(String[] args) {
		
	int[] array = {3,2,6,1};
	int temp;
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i]<array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
	}
		
	System.out.println(array[0]);
		
	}
	

}
