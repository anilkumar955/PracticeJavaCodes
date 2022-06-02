package LeetCode;

import java.util.Scanner;

	
	
	interface a{
		void demo();
	}
	interface b{
		void demo1();
		int a=8; //static ,final
	}
	class ReverseNo implements a,b{
		public void demo() {
			System.out.println("a1");
		
	}
		public void demo1() {
			System.out.println(a*a);
		}
	

	public static void main(String[] args) {
		
		ReverseNo o=new ReverseNo();
		o.demo();
		o.demo1();
	}
	
	}
		