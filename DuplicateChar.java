
package com.altimetrik.App;

public class DuplicateChar {

	public static void main(String argu[]) {

		String str = "beautiful you full";
		char[] carray = str.toCharArray();
		System.out.println("The string is:" + str);
		System.out.print("Duplicate Characters in above string are: ");
		int j;
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			String s = "";
			if (!(String.valueOf(carray[i]).equals(" "))) {
				for (j = i + 1; j < str.length(); j++) {
					if (carray[i] == carray[j]) {
						count++;
						/*if ( !s.contains(String.valueOf(carray[j]))) {
							s = s + carray[j];
						}*/
					}
				}
				if (count > 1 )
				
					System.out.print("\n" + s + " " + count);
			}
		}
	}
}