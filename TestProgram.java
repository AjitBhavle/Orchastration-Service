package com.altimetrik.App;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		//1,2,divby3,4,divby5,divby3,7,8,divby3,divby5,11,divby3,13,14,divby3anddivby5,16,17
		
		for(int i=1;i<=num;i++) {
			
			 if(((i%3)==0) && ((i%5)==0)) {
				System.out.print("divby3divby5");
			}else if((i%3)==0) {
				
				System.out.print("divby3");
				
			}else if((i%5)==0) {
				System.out.print("divby5");
			}else {
				
				System.out.print(i);
			}
			if(i!=num) {
				System.out.print(",");
			}
		}

	}
}
