package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import javax.sql.rowset.BaseRowSet;

public class hasset {

	public static void main(String[] args) {
		String[] s= {"jab" , "kil", "anil"};
		Set<String> set=new TreeSet<>();  
			
		
		for(int i=0;i<s.length;i++) {
			
			set.add(s[i]);
			System.out.println(set);
		}
//		TreeSet<Integer> ts=new TreeSet<>(hs);
//		for(int i=0;i<ts.size();i++) {
//			
//		}
		
	}

}
