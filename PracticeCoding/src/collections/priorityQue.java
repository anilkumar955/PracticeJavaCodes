package collections;
import java.util.*;
public class priorityQue {

	public static void main(String[] args) {
//		PriorityQueue<Integer>q=new PriorityQueue<Integer>();
//		q.offer(10);
//		q.offer(3);
//		q.offer(9);
//		System.out.println(q);
//		System.out.println(q.poll());
		
//		System.out.println(q.peek());
		
		
//		TO CONVERT TO MAX HEAP
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq.offer(10);
		pq.offer(90);
		pq.offer(20);
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
