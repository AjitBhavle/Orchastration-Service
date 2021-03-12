package com.altimetrik.App;

// Java Program to print the given pattern 
// package to use Scanner class 
import java.util.Scanner;
class Rightringle { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number1 of rows to be printed"); 
        int rows = sc.nextInt(); 
        
        // loop to iterate for the given number of rows 
        for (int i = 1; i <= rows; i++) { 
        	
            // loop to print the number of spaces before the star 
            for (int j = rows-1; j >=i; j--) { 
                System.out.print(" "); 
            } 
            
            for (int k = 1; k <=i; k++) { 
                System.out.print("*"); 
            } 
            
  
            // for new line after printing each row 
            System.out.println(); 
        } 
    } 
} 