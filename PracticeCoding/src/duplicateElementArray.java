import java.util.HashSet;
import java.util.Set;

public class duplicateElementArray {

	public static void main(String[] args) {
		int[]arr = {1, 2, 3, 4, 2, 7, 8, 8,0,0,1, 3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]);
				}
			}
			
		}
		
		System.out.print("****************************8");
		int[] ar = {1,2,3,1};
		Set<Integer> s = new HashSet<>();
		boolean duplicate =false;
		for(int i=0;i<ar.length;i++) {
			if(s.contains(ar[i])) {
				duplicate=true;
				System.out.println(ar[i]);
			}
			else {
				s.add(ar[i]);
			}
		}
		if(duplicate) {
			System.out.print(-1);
		}
	}
}
	
		
		 
	