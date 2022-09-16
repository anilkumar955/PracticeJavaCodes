package RevisionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseArray {

	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(reverseArray(l));
		
	}
	
	
	public static List reverseArray(List<Integer> l) {
		List<Integer> ar=new ArrayList(l.size());
//		System.out.println(l);
		for(int i=l.size()-1;i>=0;i--) {
			ar.add(l.get(i));
		}
		return  ar;
		
		
	}
	
	
}
