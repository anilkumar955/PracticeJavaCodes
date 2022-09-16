package stringProgram;

public class CountDuplicateWord {

	public static void main(String[] args) {
		  String s = "anil kumar kumar kumar ";   
		  s=s.toLowerCase();
		  int count;
		  String[] sp=s.split(" ");
		  for(int i=0;i<sp.length;i++) {
			  count=1;
			  for(int j=i+1;j<sp.length;j++) {
				  if(sp[i].equals(sp[j])) {
					  count++;
					  sp[j]="0";
				  }
			  }if(count>1 && sp[i]!="0") {
				  System.out.println(sp[i]);
				  System.out.println(count);
			  }
		  }
	         
	      
	}
}
	            
	       