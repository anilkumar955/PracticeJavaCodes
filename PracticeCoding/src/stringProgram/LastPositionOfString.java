package stringProgram;

public class LastPositionOfString {

	public static void main(String[] args) {
		String s = "java is is";
		int lastindex = s.lastIndexOf("is");
		
		if(lastindex == -1) {
			System.out.println("hello not found");
		}else {
			System.out.println(lastindex);
			
		}

	}

}
