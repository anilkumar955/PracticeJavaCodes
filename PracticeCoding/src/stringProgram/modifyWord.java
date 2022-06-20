package stringProgram;

public class modifyWord {
	public static void main(String[] args) {
	String s="anil kumar dashsdf df eeedf df"; String a= "";
	String w="";s+=" "; String lw=" ";int count=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c!=' ') {
			w=w+c;
		}else {
			if(w.equals("dashsdf"))
				a=a+"Dash"+" ";
			else
				a=a+w+" ";
				w="";
			
		}
	}
	System.out.print(a);
	}

}
