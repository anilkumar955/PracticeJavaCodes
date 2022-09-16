package stringProgram;

public class ReverseStringWithoutSpecialChar {
	
	public  static void rev(char[] ss) {
		
		int i=0;
		int j=ss.length-1;
		while(i<j) {
			
			if(!Character.isAlphabetic(ss[i])) {
				i++;
			}else if(!Character.isAlphabetic(ss[j])) {
				j--;
			}else {
				char temp=ss[i];
				ss[i]=ss[j];
				ss[j]=temp;
				i++;
				j--;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String s="j!b@#ca"; 
		char[] c= s.toCharArray();
		rev(c);
		String rev=new String(c);
		System.out.println(rev);
		
		
		
	}
		

	
	

}
