package stringProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class StringWordcount {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap();
		String[] s= {"apple","orange","apple"};
		for(int i=0;i<s.length;i++) {
			String[] sp=s[i].split(" ");
//			System.out.println(Arrays.toString(sp));
			if(!map.containsKey(sp[0])) {
				map.put(sp[0], 1);
			}else {
				int value=map.get(sp[0]);
				map.put(sp[0], value+1);
			}
		
	}
		System.out.println(map);

}}
