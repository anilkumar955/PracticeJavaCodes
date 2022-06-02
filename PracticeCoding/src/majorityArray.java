import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class majorityArray {
    public static void main(String[] args)
    {
 
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;
        int maxcount=0; //1
        int index=-1;
        for(int i=0;i<n;i++) {
        	int count=0;
        	for(int j=0;j<n;j++) {
        		if(arr[i]==arr[j]) 
        			count++;
        		}
        		if(count>maxcount) {
        			maxcount=count;
        			index=i; //0
        		}}
        		if(maxcount>n/2) 
        			System.out.println(arr[index]);
        			else 
        				System.out.println("no majority");
        		}
        		}
        		
        		
        	    
 
        // Function calling
      