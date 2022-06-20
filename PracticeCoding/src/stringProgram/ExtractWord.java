package stringProgram;

public class ExtractWord {

	public static void main(String[] args) {
		
		String s = "ani kumaa";
		String b=" ";
		s=s+" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				b=b+c;
			}else {
				
				System.out.println(b);
				b=" ";
			}
		}
		
	}

}
