package stringProgram;

public class ReverseString {

	public static void main(String[] args) {
		String s = "anil";
		
		String re = " ";
		for(int i=s.length()-1;i>=0;i--) {
			char c =s.charAt(i);
			System.out.print(c);
			re =c + re;
		}
			if(s.equalsIgnoreCase(re)) {
				System.out.println("pali");
				
			}else {
			System.out.println("not pali");
		}
		
			
		}
		
//		System.out.println(sf);
		

	
}
