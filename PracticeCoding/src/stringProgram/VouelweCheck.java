package stringProgram;

public class VouelweCheck {

	public static void main(String[] args) {
		String s = "Awelcome";
		String l=s.toLowerCase();
		for(int i=0;i<l.length();i++) {
			int count =0;
			if(l.charAt(i)=='a'|| l.charAt(i)=='e'|| l.charAt(i)=='i'||l.charAt(i)=='o'||l.charAt(i)=='u') {
				System.out.println("vowel is :"+ l.charAt(i));
				count=count+i;
				System.out.println("vowel count is : " +count);
			}
			
		}
		
		

	}

}
