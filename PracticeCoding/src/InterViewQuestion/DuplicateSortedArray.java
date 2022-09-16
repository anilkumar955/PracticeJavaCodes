package InterViewQuestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSortedArray {

	public static void main(String[] args) {
		int[] a= {6,7,61,2,2,3,3,4,4};
//		int[] b=new int[a.length];
//		int j=0;
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]!=a[i+1]) {
//				b[j]=a[i];
//				j++;
//			}
//		}
//		b[j]=a[a.length-1];
//		for(int i=0;i<a.length;i++) {
//			System.out.println(b[i]);
//		}
		
		System.out.println("---------------2nd approach-------");
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int no:set) {
			System.out.println(no);
		}
		
		
	}
}
		