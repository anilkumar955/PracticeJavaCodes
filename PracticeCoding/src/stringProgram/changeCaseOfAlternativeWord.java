package stringProgram;

public class changeCaseOfAlternativeWord {

	public static void main(String[] args) {
		String s="anil kumar";
		String w="";s+=" ";String a="";int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}else {
				if(count++%2==0)
					a=a+w.toLowerCase()+" ";
				else
					a=a+w.toUpperCase()+" ";
				w=" ";
					
				}
			
		}
		
		System.out.print(a);
	}

}
