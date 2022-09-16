package stringProgram;

public class AddCharacterasDigit {

	public static void main(String[] args) {
		String s="A2B3";
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(!Character.isDigit(s.charAt(i))) {
				
				i++;
			}else if(!Character.isDigit(s.charAt(j))) {
				j--;
				
			}else {
				
			}
		}

	}

}
