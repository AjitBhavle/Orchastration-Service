package com.altimetrik.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MaxMinNo {
    public static String firstNonRepeatingLetter(String str) {
    	String res = null;
    	List<String> list=new ArrayList<String>();
    	int count=0;
    	for(int i=0;i<=str.length()-1;i++)
    	{
    		for(int j=i+1;j<=str.length()-1;j++) {
    			if((str.charAt(i)!=str.charAt(j))) {
    				res=String.valueOf(str.charAt(j));
    				break;
    				
    			}
    			
    		}
    		if(count==0)
				break;
    		
    	}
    	System.out.println(res);
		return res;
   
    }
  public static void main(String[] arg){
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter numer in String format:");
	  String str=sc.nextLine();
	  MaxMinNo.firstNonRepeatingLetter(str);
    
  }
}