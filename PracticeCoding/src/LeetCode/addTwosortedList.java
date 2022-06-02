package LeetCode;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class addTwosortedList {

	public static void main(String[] args) {
		List<Integer>l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(4);
		List<Integer>ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(3);
		ll.add(4);
		List<Integer>lll=new LinkedList<Integer>();
	    lll.addAll(l);
	    lll.addAll(ll);
	    System.out.println(lll);
	}

	    	
}