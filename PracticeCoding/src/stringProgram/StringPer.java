package stringProgram;

public class StringPer {

	public static void main(String[] args) {
		String s="abcd";
		String per="";
		if(s.length()==0) {
			System.out.println(s);
		}else {
			for(int i=0;i<s.length();i++) {
				
				String subst=s.substring(0,i) ;
				String d=s.substring(i+1,s.length());
				per=per+s.charAt(i)+subst+d;
				
			}
			
		}
		System.out.println(per+ " ");
	}

}
