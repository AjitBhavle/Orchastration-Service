
package com.altimetrik.App;

public class SumOfConsicativeNum {

	public static void main(String[] args) {

		int[] num = { 1, 5, 2, 3, 4, 5, 5, 3, 4, 5 };
		int sum = 0, res = 0;
		//Arrays.sort(num);
		int num1, num2;
		for (int i = 0; i < num.length; i++) {
			num1 = num[i];
			num2 = num[i + 1]+1;
			if (num1 == num2) {
				sum = sum + num[i] + num[j];
			} else
				sum = 0;
			if (sum > res) {
				res = sum;
			}
		}
	}
}
