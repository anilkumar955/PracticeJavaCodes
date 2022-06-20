package stringProgram;

public class AarrangeString {

	public static void main(String[] args) {
		
		String s="anil d 955";
		String a=" ",b=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				a=a+c;
			}else {
				b=b+c;
			}
		}
		
		System.out.println(a.concat(b));
		
		
	}
		
}
