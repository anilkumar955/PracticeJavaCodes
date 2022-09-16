	package stringProgram;

public class Anagram {

	public static void main(String[] args) {
		String s="ana";
		String ss="na";
		char[] c=s.toLowerCase().toCharArray();
		char[] cc=ss.toLowerCase().toCharArray();
		if(c.length!=cc.length) {
			System.out.println("not ana");
		}
		
		else {
			for(int i=0;i<c.length;i++) {
				for(int j=i+1;j<cc.length;j++) {
					if(c[i]<c[j]) {
						char temp=c[i];
						c[i]=c[j];
						c[j]=temp;
					}
					if(cc[i]<cc[j]) {
						char temp=cc[i];
						cc[i]=cc[j];
						cc[j]=temp;
					}
					
				}
				
				String a=String.valueOf(c);
				String b=String.valueOf(cc);
				if(a.equals(b)) {
					System.out.println("ana");
				}else {
					System.out.println("not ana");
				}
				
			}
			
		}
		
		
		
	}
}
		
		
		