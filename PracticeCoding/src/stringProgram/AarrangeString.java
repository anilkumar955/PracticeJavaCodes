package stringProgram;

public class AarrangeString {

	public static void main(String[] args) {
		String a ="",b="";
		String s ="anil 955 dash";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isDigit(c)) {
				a=a+c;
				
			}else {
				b=b+c;
			}
		}
		System.out.println(a.concat(b));

	}

}
