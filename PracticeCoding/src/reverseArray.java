import java.util.Arrays;
import java.util.Stack;

public class reverseArray {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int[]array = {1,2,3,4};
		int size = array.length;
		
		
		for(int i=0; i<size ;i++) {
			stack.push(array[i]);
		}
		int[]reverseArray = new int[size];
		for(int i=0;i<size;i++) {
			reverseArray[i] = stack.pop();
		}
		System.out.println(Arrays.toString(reverseArray));
			
			
		}
}

