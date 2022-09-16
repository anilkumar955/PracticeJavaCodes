import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s="awbcdzy";
		String s1="aCdbzwy";
		char[] c=s.toLowerCase().toCharArray();
		char[] d=s1.toLowerCase().toCharArray();
		char temp=0;
		if(c.length!=d.length) {
			System.out.println("not pali");
		}else {
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];	
					c[j]=temp;
					
					
				}
				if(d[i]>d[j]) {
					temp=d[i];
					d[i]=d[j];	
					d[j]=temp;
			}
		}
		
		
	}
		String e=String.valueOf(c);
		String f=String.valueOf(d);
		if(e.equalsIgnoreCase(f)) {
			System.out.println("pal");
		}else {
			System.out.println("not pal");
		}
	}
	   
	}		

		
	
}