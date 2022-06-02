package LeetCode;

public class lengthOfLastString {

	public static void main(String[] args) {
		String s="   fly me   to   the moon  ";
		String use=s.trim();
		int count=0;
		for(int i=use.length()-1;i>=0;i--) {
			if(use.charAt(i)!=' ')  {
				count++;
				
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

}
