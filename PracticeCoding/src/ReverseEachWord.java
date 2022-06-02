
public class ReverseEachWord {

	public static void main(String[] args) {
		String word = "Anil Dash";
		String op = "";
		String[] sp= word.split(" ");
		for(String w:sp) {
			String rev = " ";
			for(int i=w.length()-1;i>=0;i--) {
				rev = rev+w.charAt(i);
			}
			op=op+rev+" ";
			}
		
		System.out.print(op);
		
	}

}
