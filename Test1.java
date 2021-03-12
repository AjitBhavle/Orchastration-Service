package com.altimetrik.App;

import java.util.ArrayList;
import java.util.List;

class Test1{
	


	public static void main(String arg[]) {
		
		int[] ints = {1, 2, 3,5,5,3};
		List<Integer> intList = new ArrayList<Integer>(ints.length);
		for (int i : ints)
		{
		    intList.add(i);
		}
		intList.add(5);
		
		
		System.out.println(intList.stream().count()); 
		
	}
	
	
	}
