package stringProgram;

public class CapitalEachWord {

	public static void main(String[] args) {
		String s="anil kumar dashsdf";
		
		String w="";s=s+" ";String a="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!= ' ') {
				w=w+c;
			}else {
				char f=w.charAt(0);
				f=Character.toUpperCase(f);
				a=a+f+w.substring(1)+ " ";
				w="";
				
			}
		}
		System.out.println(a);
	}
	

}
