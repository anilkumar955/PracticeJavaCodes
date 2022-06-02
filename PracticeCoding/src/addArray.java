
public class addArray {
	public static void main(String[] args) {
		boolean flag=true;
		int x=-121;
	
		int actno=x;
		int res=0;
		while(x!=0 && x<0) {
			
			int digit=x%10;
			res= res*10+digit;
			x=x/10;
		}
		if(actno==res) {
			System.out.println("pali");
		}
		else {
			System.out.println("not pali");
		}
		
	}


	 {
		
	
	}
}

	

	
		
		
		
			
		


	