package stringProgram;

public class RemoveWhiteSpaceFormString {

	public static void main(String[] args) {
		String s = "a n  i            l";
		String f=s.replaceAll(" ", "");
//		String f = s.trim();
		System.out.println(f);

	}

}
