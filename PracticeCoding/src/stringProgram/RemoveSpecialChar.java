package stringProgram;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String s = "A@n*i$L";
		String p =s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(p);
		

	}

}
