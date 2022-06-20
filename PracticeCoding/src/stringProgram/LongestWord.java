package stringProgram;

public class LongestWord {
	public static void main(String[] args) {
		String s="anil kumar dashsdf";
		String w="";s+=" "; String lw=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}else {
				
				if(w.length()>lw.length()) {
					lw=w;
					w="";
				}
			}
			
		}System.out.println(lw);
		
	}

}
