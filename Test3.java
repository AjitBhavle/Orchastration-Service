
package com.altimetrik.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.primitives.Ints;

public class Test3 {

	public static void main(String arg[]) {

		int a[] = { 2, 1, 5, 7, 19 };
		int b[] = { 1, 2, 7, 5, 19,30};
		
		List<Integer> array=new ArrayList<Integer>();
		int count=0;
		for(int i=0; i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j])
					array.add(a[j]);
				
			}
			
		}
		
		System.out.println(array);
	
		int c[]=Ints.toArray(array);
		
		
		if(Arrays.equals(a,c))
			System.out.println("equal");
		else System.out.println("Not equal");
		
		
	/*	Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		if (a.length == b.length) {
			if (
Arrays.equals(a, b)) {
				System.out.println("array are same");
			} else {
				
				System.out.println("array are not same");
			}
		}*/
	}
}
