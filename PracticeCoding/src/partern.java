
public class partern {

	public static void main(String[] args) {
		
		String s="ania";
		char[] ch=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					sb.append(ch[i]);
					
				}
				else {
					sb1.append(ch[j]);
					System.out.println(ch[j]);
				}
				
				
		}
			
			}
					
		
		
			}
}	
		
		
		
