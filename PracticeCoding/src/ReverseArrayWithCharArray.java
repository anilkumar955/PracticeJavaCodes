
public class ReverseArrayWithCharArray {

	public static void main(String[] args) {
		String name="anil";
//		Conversion string to character array
		char ch[] = name.toCharArray();
		String reverseName = "";
		for(int i=ch.length-1;i>=0;i--) {
			reverseName=reverseName+ch[i];
		}
		
		System.out.println(reverseName);
		}
		



	}


