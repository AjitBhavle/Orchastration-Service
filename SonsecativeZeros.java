package com.altimetrik.App;

public class SonsecativeZeros {
	public static void main(String arg[]) {
		int a[]= {1,1,1,0,0,0,0,0,1,0,0,0,0,1,1,0};
		int count = 0,len=a.length-1,res=0,res1=0,count1 = 0;
		for(int i=0;i<=len;i++) {
			if(a[i]==0) 	
				count++;
				
				else
					count=0;
				
				if(count>res)
				{
					res=count;
				}
				if(a[i]==1) 	
					count1++;
					
					else
						count1=0;
					
					if(count1>res1)
					{
						res1=count1;
					}
		}	
		System.out.println("Max Consecative 0's are:" +res);
		System.out.println("Max Consecative 1's are:" +res1);
	}
}