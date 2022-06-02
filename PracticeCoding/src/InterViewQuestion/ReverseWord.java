package InterViewQuestion;

public class ReverseWord {

	public static void main(String[] args) {
		
		String a="anil kumar";
		String[] s =a.split(" ");
		for(String b:s) {
			String rev=" ";
			for(int i=b.length()-1;i>=0;i--) {
				rev=rev+b.charAt(i);
			}
			System.out.print(rev);
		}
	
		
	}

}
