package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class arraylist {

	
//		ArrayList<Integer>ls=new ArrayList<>(Arrays.asList(25 ,26, 7, 8 ,10 ,11 ,79));
//		int size = ls.size();
//		Collections.sort(ls);
//		System.out.println(ls.get(size-3));
		
		
		
		    public int thirdMax(int[] nums) {
		        int temp;
		        int len = nums.length;
		        for(int i=0;i<nums.length;i++){
		            for(int j=i+1;j<nums.length-1;j++){
		                if(nums[i]==nums[j]){
		                    temp = nums[i];
		                    nums[i]= nums[j];
		                    nums[j]=temp;
		                }
		            }
		        }
		            System.out.println(nums[len-3]);
					return nums[len-3];
		        }
		       public static void main(String[] args){
		           int[] nums = {3,2,1};
		           
		       }
		}

		
//		ls.add(1);
//		ls.add("Anil");
//		ls.add("Anil");
//		ls.add(2);
//		Object a = ls.clone();
//		System.out.println();
//		System.out.println(ls);
//		System.out.println("a value is:" + a);
		
//REVERSE THE ARRAYLIST VALUE
//		int size = ls.size();
//		for(int i=size-1;i>=0;i--) {
//			Object j = ls.get(i);
////			System.out.print(j+ " ");
//		}
//		Iterator it = ls.iterator();
//		while(it.hasNext()) {
////			System.out.print(it.next() + " ");
//			
//		}
//		it.remove();
//		System.out.println(ls);
//		System.out.println(ls.subList(2, 3));
		
		// Convert arrylist to string
		
//		StringBuilder sb= new StringBuilder();
//		for(Object s:ls) {
//			sb.append(s);
//			String a = sb.toString();
//			System.out.print(a);
//		}
		
		
//	}
//
//	private static void sysoutls(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//}
