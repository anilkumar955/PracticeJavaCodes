package stringProgram;

public class CapitalToSmallString {

	public static void main(String[] args) {
		String s ="ANIL";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int a=(int)c+32;
			System.out.println((char)a);
		}
	}
}