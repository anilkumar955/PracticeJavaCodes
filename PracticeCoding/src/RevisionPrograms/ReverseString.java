package RevisionPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="anil kumar dash";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}

	}

}
