package StringInterviewQuestion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		String s=" I am from Mumbai";
		String[] sp=s.split(" ");
		String rev="";
		for(int i=sp.length-1;i>=0;i--) {
				rev=rev+sp[i]+" ";
			}System.out.print(rev);
		}
		

	

}
