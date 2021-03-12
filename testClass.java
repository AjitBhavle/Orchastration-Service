class testClass {
	public static void main(String[] arg) {
		String[] arr= {"1","0","4","5","0","8"};
		String str=arr.toString();
		String str1[]; 
		String s3,s2 = null,s = null;
		for (int i=0; i<=str.length()-1;i++) {
			
			if(str.contains("0")==true)
			{
				 s=s+str.charAt(i);
			}
			else
			{
				 s2=s+str.charAt(i);
			}
			
			 
			System.out.println(s3 =s2+s);
			
		}
		
	}
	
	
}
