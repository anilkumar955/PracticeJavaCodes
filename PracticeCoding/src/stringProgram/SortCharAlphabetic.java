package stringProgram;

public class SortCharAlphabetic {

	public static void main(String[] args) {
		String s = "naaa";
		char temp;
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println(c);

	}

}
