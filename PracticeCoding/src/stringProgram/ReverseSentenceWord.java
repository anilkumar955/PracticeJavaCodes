package stringProgram;

public class ReverseSentenceWord {

	public static void main(String[] args) {
		String s="anil kumar dash";
		String s1="";
		String[] sp= s.split(" ");
		for(String spt:sp) {
			String rev=" ";
			for(int j=spt.length()-1;j>=0;j--) {
				rev=rev+spt.charAt(j);
			}
			s1=s1+rev;
		}
		System.out.println(s1);

	}

}
