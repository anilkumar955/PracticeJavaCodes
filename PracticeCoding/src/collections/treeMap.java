package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		Map<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("av", 1);
		tm.put("ab", 9);
		tm.put("c", 3);
		tm.put("d", 5);
		System.out.println(tm);
		System.out.println(tm.keySet());
		tm.remove("d");
		System.out.println(tm);
	}

}
