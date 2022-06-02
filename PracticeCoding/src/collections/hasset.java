package collections;

import java.util.HashSet;

public class hasset {

	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(4);
//		System.out.println(hs);
//		hs.remove(4);
//		hs.clear();
		System.out.println(hs);
		for(int i:hs) {
			System.out.println(i);
		}
		if(hs.contains(4)) {
			hs.add(7);
			System.out.println(hs);
		}
		
		
			
			
	}

}
