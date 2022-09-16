package stringProgram;

public class AarrangeString {

	public static void main(String[] args) {
		
		String s="anil d 955";
		
String a="";String b="";

for(int i=0;i<s.length();i++) {
	if(Character.isDigit(s.charAt(i))) {
		a=a+s.charAt(i);
	}else 
		b=b+s.charAt(i);
}
System.out.println(a.concat(b));}
}