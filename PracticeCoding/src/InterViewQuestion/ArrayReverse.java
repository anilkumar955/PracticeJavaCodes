package InterViewQuestion;

import java.util.Arrays;
import java.util.Stack;

public class ArrayReverse {

	public static void main(String[] args) {
		int[]a= {3,5,1,7};
		Stack<Integer> s=new Stack();
		for(int i=0;i<a.length;i++){
			s.push(a[i]);
		}
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=s.pop();
		}
		System.out.println(Arrays.toString(b));
	
	}
}
		