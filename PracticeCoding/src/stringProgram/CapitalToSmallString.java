package stringProgram;

public class CapitalToSmallString {

	public static void main(String[] args) {
		String s ="anil";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int cap=(int)c-32;
			System.out.print((char)cap);
		}
		
	}
}
	