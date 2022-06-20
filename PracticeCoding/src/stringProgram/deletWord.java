package stringProgram;

public class deletWord {

	public static void main(String[] args) {
		String s="anil kumar dashsdf";
		String w="";s+=" ";String a="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}else {
				if(!w.equals("dashsdf"))
				a=a+w+" ";
				w="";
					
			}
		}System.out.println(a);

	}

}
