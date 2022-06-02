
public class removeSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "@#ddf@!3242r";
		String a = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);

		System.out.println("*******REMOVING SPACE ***************");
		String s1 = "A N I L";
		String sp = s1.replaceAll("\\s", "");
		System.out.println(sp);
	}

}
