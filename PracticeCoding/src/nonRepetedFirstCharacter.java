
public class nonRepetedFirstCharacter {

	public static void main(String[] args) {
		String s = "aabbcdde";
		StringBuffer sb =new StringBuffer();
		char[] c =s.toCharArray();
		boolean repeted = false;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					repeted=false;
					break;
				}
				if(repeted) {
					sb.append(c[i]);
					System.out.print(sb);
					break;
					
				}
			}
			
		}
			}

}
