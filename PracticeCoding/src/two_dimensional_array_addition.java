
public class two_dimensional_array_addition {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3},
					{2 ,3 ,4}};
		
		int[][] b = {{1, 2, 3},
					 {2 ,3 ,4}};
		
		int[][] c = {{0, 0, 0},
				     {0 ,0 ,0}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println(c[i][j] +" ");
				c[i][j] = a[i][j] + b[i][j];
			}
			
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println(c[i][j] +" ");
				c[i][j] = a[i][j] + b[i][j];
			}
		System.out.println("");
		}

	}

}
