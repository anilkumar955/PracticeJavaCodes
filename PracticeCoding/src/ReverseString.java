
public class ReverseString {

	public static void main(String[] args) {
		
		String a = "Anil";
//		int len=a.length();
		char[] ch=a.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		
		}
		
		System.out.println("****************************");
		
		String sb = new StringBuffer(a).reverse().toString();
		System.out.print(sb);
		
		
		System.out.println("****************************");
		
		String sv= new StringBuilder(a).reverse().toString();
		System.out.print(sb);
	}
}
	