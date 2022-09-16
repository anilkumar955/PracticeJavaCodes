package InterViewQuestion;

import java.util.HashSet;

import java.util.Set;


		

		public class FirstNonRepetedCharacter {

			public static void main(String[] args) {
				String s="andad";
				StringBuffer sb= new StringBuffer();
				char[] c=s.toCharArray();
				for(int i=0;i<c.length;i++) {
					boolean flag=false;
					for(int j=0;j<c.length;j++) {
						if(i!=j && c[i]==c[j]) {
							flag=true;
							break;
						}
						
					}if(!flag) {
						sb=sb.append(c[i]);
					}
				}
				System.out.println(sb);
			
			}
		}
