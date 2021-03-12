import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class anagramStringArray {

	public static void main(String arg[]) {

		String[] str= {"eat", "tea", "tan", "ate", "nat", "bat"};
		String str1 = "";
		
		char[] ch;
		
		for(int j=0;j<=str.length-1;j++)
		{
	
			str1=str[j];
			ch=str1.toCharArray();
			Arrays.sort(ch);
			str[j]=new String(ch);

		}
		
		for(int j=0;j<=str.length-1;j++)
		{
			int count=0;
			for(int k=j+1;k<=str.length-1;k++) {
				
				if(str[j].compareTo(str[k])==0) {
					count++;	
				}
			}
			if(count==1) {
				System.out.println("Anagram word is: "+str[j]);
			}
				
		}
		
		
				
		
	/*	for(int k=0;k<=str.length-1;k++) {
			str3=str[k];
			
			for (int i = 0; i <= str3.length()-1; i++) 
	        {
	            for (int j = i + 1; j<= str3.length()-1; j++) { 
	                if (str3.charAt(i)<str3.charAt(j)) 
	                {
	                    temp = str3.charAt(i);
	                    str3.charAt(i) = str3.charAt(j);
	                    str[j] = temp;
	                }
	            }
	        }
			
			System.out.println("Sorted word is: "+str3[i]);		

			
		}*/
		

		/*for(int i=0;i<=str3.length-1;i++)
		{
			
			System.out.println("Anagram word is: "+str3[i]);		

			
		}*/	
		/*for(int j=0;j<=str3.length-1;j++)
		{
			for(int k=0;k<=str3.length-1;k++) {
				if(str3[j].equals(str3[k])) {
					System.out.println("Anagram word is: "+str3[k]);
				}
			}

		}*/
		
		/*for(int j=0;j<=str2.length()-1;j++)
		{
			for(int k=0;k<=str2.length()-1;k++) {
				if(str2.charAt(j)==str2.charAt(k)) {
					System.out.println("Anagram word is: "+str2.charAt(j));
				}
			}

		}*/
		
		
		/*for(int i=0;i<=str.length-1;i++)
		{
			Arrays.sort(str);
			str1=Arrays.toString(str);

		}		
		String[] str3=str1.split(",");
		for(int j=0;j<=str3.length-1;j++)
		{
	
			System.out.println(str3[j]);
			ch=str3[j].toCharArray();
			Arrays.sort(ch);
			str2=Arrays.toString(ch);

		}	*/
		

		/*	for(int i=0;i<=str.length-1;i++) {

			for(int j=i+1;j<=str.length-1;j++) {
				if(str[i].length()==str[j].length()) {
					a1=str[i].toCharArray();
					Arrays.sort(a1);
					a2=str[j].toCharArray();
					Arrays.sort(a2);

					System.out.println("Anagram is: "+a1 +a2);
					if(a1.equals(a2)) {

					}
				}
			}
		}*/
	}

}
