public class LongestSubString {

	public static void main(String arg[])
	{
		String str="ABCDCBAHJTSMS";
		String str2 ="",str3="";
		int large=0;
		char ch;
		for(int i=0;i<=str.length()-1;i++) {
			ch=str.charAt(i);
			for(int j=i+1;j<=str.length()-1;j++) {
				str2=str.substring(i,j);
				if(str.charAt(i)) {
					if(large<str2.length()) {
						str3=str2;
						large=str2.length();
					}
				}

			}
			
		}
		System.out.println("Largest SubString is:"+str3+" length is: "+large);
	
	}
	
}