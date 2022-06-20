package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class addElement {
	public static void main(String[] args) {
		
	//Iterating values using iterator	
		ArrayList<Object> ar=new ArrayList();
		ar.add("anil");
		ar.add(234);
		ar.add("d");
		Iterator it=ar.iterator();
		while(it.hasNext()) {
			Object w=it.next();
			System.out.println(w);
			
		}
	
	
	//add values in the list
	ar.set(1, "kumar");
	for(Object arr:ar) {
		System.out.println("new added element" + arr);
	
	}
	
	
	}

}
