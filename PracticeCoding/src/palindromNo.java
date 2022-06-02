import java.util.Stack;

public class palindromNo {

	public boolean demo(String s) {
		Stack<Character>stack=new Stack<Character>();
		
		for(char c:s.toCharArray()) {
//			System.out.println(c);
			if(c=='(') 
				stack.push(')');
			else if(c=='{')
				stack.push('}');
			else if(c=='[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop()!=c)
				return false;
				
			}
		
		return stack.isEmpty();
		
	
	}
	
	public static void main(String[] args) {
		palindromNo a=new palindromNo();
		a.demo("()");
		
	}

}
