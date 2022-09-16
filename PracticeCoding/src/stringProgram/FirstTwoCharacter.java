package stringProgram;

public class FirstTwoCharacter {

	public static void main(String[] args) {
		String s="Ansx Nil Ill Lol";
		String w="";s+=" ";
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}else {
				System.out.print(w.substring(0, 2));
				w="";
			}
			
		}

	}

}
