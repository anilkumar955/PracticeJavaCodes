package stringProgram;

public class FindLexigoSubstring {
	
	public static String lexismal(String s,int k) {
		
		String curentSub=s.substring(0,k);
		String smallest=curentSub;
		String largest=curentSub;
		for(int i=0;i<s.length()-k;i++) {
			curentSub=s.substring(i,i+k);
			if(curentSub.compareTo(smallest)>0) {
				smallest=curentSub;
			}
			if(curentSub.compareTo(largest)<0) {
				largest=curentSub;
			}
			
		}
		return largest + "\n" + smallest;
		
	}
	

	public static void main(String[] args) {
		
		String s="sfadf";
		System.out.println(lexismal(s,3));
		

	}

}
