package stringProgram;

public class ReverseSentenceWord {

	public static void main(String[] args) {
	
String S="ani kumar dash";
System.out.println(reverseWords(S));


}
public static String reverseWords(String S)
{
    String[] sp=S.split(" ");
   
        String rev="";
        for(int i=sp.length-1;i>=0;i--){
            rev=rev+sp[i]+" ";
        }
         return rev;
    }

}