package stringProgram;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String s = "anil kumar";
		String a = " ";
		
		String[] sp =s.split(" ");
		for(String spp:sp) {
		String rev = "";
		for(int j=spp.length()-1;j>=0;j--) {
			
				rev = rev+spp.charAt(j);
		}
	a=a+rev+ " ";
				
			
			
			
		}
		System.out.println(a);
	}
}
