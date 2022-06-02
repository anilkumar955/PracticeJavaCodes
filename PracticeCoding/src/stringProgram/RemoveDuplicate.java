package stringProgram;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "baniin";
		StringBuffer sb= new StringBuffer();
	
		char[] c = s.toCharArray();
		for(int i =0;i<c.length;i++) {
			boolean repeat = false;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					repeat=true;
					break;
				}}
				if(!repeat) {
					sb.append(c[i]);
				}
			}
		System.out.println(sb);
}}
