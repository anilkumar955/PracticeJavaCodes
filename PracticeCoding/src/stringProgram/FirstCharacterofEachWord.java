package stringProgram;

public class FirstCharacterofEachWord {
	public static void main(String[] args) {
		
		String s="An Nil Ill Lol";
		String w="";s+=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
				
			}else {
				System.out.print(w.charAt(0));
				w="";
			
			}
			
			
		}

	}

}
