package InterViewQuestion;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumberArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,10};
		Arrays.sort(arr);
		HashSet<Integer> set=new HashSet();
		for(int i=0;i<arr[arr.length-1];i++) {
			set.add(i);
		}
		System.out.println(set);
		for(int i=0;i<arr.length;i++) {
			set.remove(arr[i]);
			System.out.println(set);
		}
		for(int x:set) {
			System.out.println(x);
		}
		
	}

	

}
