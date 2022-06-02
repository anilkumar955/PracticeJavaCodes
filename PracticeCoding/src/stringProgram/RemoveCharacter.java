package stringProgram;

public class RemoveCharacter {

	public static void main(String[] args) {

		 String MyString = "ello"; 
		for(int i=0;i<MyString.length();i++) {
			if(Character.isLowerCase(MyString.charAt(i))) {
				System.out.println(true);
				break;
			}else {
				System.out.println("false");
			}
		}
	}
}
			