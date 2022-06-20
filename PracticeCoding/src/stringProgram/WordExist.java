package stringProgram;

public class WordExist {

	public static void main(String[] args) {
		String s="anil kumar dashsdf df eeedf df";
		String w="";s+=" "; String lw=" ";int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}else {
				if(w.equalsIgnoreCase("kumar"))
					count++;
				w="";
				
			}
		}
		if(count==0)
			System.out.println("not found");
		else
			System.out.println("found");
	

	}

}
