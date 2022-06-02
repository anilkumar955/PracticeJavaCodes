package collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class arrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer>ad=new ArrayDeque<Integer>();
		ad.push(3);
		ad.offer(5);
		ad.add(9);
		System.out.println(ad);
		ad.offerFirst(1);
		ad.offerLast(10);
		System.out.println(ad);
		System.out.println(ad.peekLast());
		
		System.out.println(ad.peekFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		
		Iterator it=ad.iterator();
		while(it.hasNext()) {
			int a=(int) it.next();
			System.out.println(a);
		
		}
	}
		
	

}
