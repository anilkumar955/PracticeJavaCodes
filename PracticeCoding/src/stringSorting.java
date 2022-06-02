import java.util.Arrays;

public class stringSorting {

	public static void main(String[] args) {
		String s= "9871";
		char temp;
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println(c);
		System.out.println("*********************************************");
		
		String s1="RAJU";
		char[] ar = s1.toCharArray();
		Arrays.sort(ar);
		System.out.println(ar);
	}

}
