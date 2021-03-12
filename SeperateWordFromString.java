package com.altimetrik.App;

public class SeperateWordFromString {
	
	public static void main(String[] args) 
    { 
			String str="My name     A@ji#t"; //ym eman t@ij#A
			String sValue = str.trim().replaceAll("\\s+", " ");
			String[] strArray=sValue.split(" ");
			System.out.println(sValue);
			String str1="", str3="";
			for(int i=0;i<=strArray.length-1;i++) {
				str1=strArray[i];
				String str2="";
				int l=0, r=str1.length()-1;
				char[] ch= str1.toCharArray();
				for(int j=str1.length()-1;j>=0;j--) {
						str2=str2+str1.charAt(j);
					}
				str3=str3+" "+str2;	
				}
				
			System.out.println(str3);

			}

}
