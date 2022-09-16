package stringProgram;

public class RemoveWhiteSpaceFormString {

	public static void main(String[] args) {
		int fno=2;
		int lno=20;
		for(int no=fno;no<lno;no++) {
			int temp=0;
			for(int i=2;i<no-1;i++) {
				if(no%i==0) {
					temp++;
					break;
					
				}
			}if(temp==0) {
				System.out.println(no);
			}
		}
	}

}
