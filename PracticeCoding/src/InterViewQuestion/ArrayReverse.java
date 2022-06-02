package InterViewQuestion;

import java.util.Arrays;
import java.util.Stack;

public class ArrayReverse {

	public static void main(String[] args) {
		int[]a= {3,5,1,7};
		int size=a.length;
		Stack s=new Stack();
		for(int i=0;i<a.length;i++) {
			s.push(a[i]);
			
			
		}
		int[] b = new int[size];
		for(int i=0;i<size;i++) {
			b[i]=(int) s.pop();
		}
System.out.println(Arrays.toString(b));
	}

}
