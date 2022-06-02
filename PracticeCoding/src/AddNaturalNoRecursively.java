
public class AddNaturalNoRecursively {

	public static void main(String[] args) {
		int num=2;
		int sum=addSum(num);
		System.out.println(sum);
		
		
		
		
	}
	public static int addSum(int num) {
		if(num!=0) {
			return num+addSum(num-1);
		}
		else {
			return num;
		}
		
		
	}
	
}