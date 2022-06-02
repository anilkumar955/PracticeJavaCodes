package LeetCode;

import java.util.Stack;

public class Parathencies {
	
	public boolean para(String s) {
		
		Stack<Character>st=new Stack<Character>() ;
		for(char c:s.toCharArray()) {
			
			if(c == '[') 
				st.push(']');
			
			else if(c=='{') 
				st.push('}');
			
			else if(c=='(') 
				st.push(')');
			
			else if(st.isEmpty() || st.pop()!=c)
			return false;
					
		}
		return st.isEmpty();
			
	}
		
	
	
	
	public static void main(String[] args) {
		String s="[]{}";
		Parathencies p=new Parathencies();
		p.para(s);

	}

}
