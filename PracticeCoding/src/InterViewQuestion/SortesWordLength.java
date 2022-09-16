package InterViewQuestion;

public class SortesWordLength {

	public static void main(String[] args) {
		String s="anil kumar";String wl=" ";
		String w="";s=s+" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}else {
				if(w.length()>wl.length()) {
					wl=w;
					w="";
				}
				
			}
			
		}
		System.out.println(wl);
	}

}
