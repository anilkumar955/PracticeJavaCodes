package SortIngAlgo;

public class StringSortSelection {

	public static void main(String[] args) {
		String[] s= {"dz","dk" , "da","da"};
		for(int i=0;i<s.length;i++) {
			int min=i;
			for(int j=i+1;j<s.length;j++) {
				if(s[j].compareTo(s[min])<0) {
					min=j;
				}
			}
			String temp=s[i];
			s[i]=s[min];
			s[min]=temp;
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+ "");
		}
	}

}
