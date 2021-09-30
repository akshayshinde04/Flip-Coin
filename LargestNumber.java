package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int a, b, c, largest, temp;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = num.nextInt();
		System.out.println("Enter the second number:");
		b = num.nextInt();
		System.out.println("Enter the third number:");
		c = num.nextInt();
		// comparing a and b and storing the largest number in a temp variable
		temp = a > b ? a : b;
		// comparing the temp variable with c and storing the result in the variable
		largest = c > temp ? c : temp;
		// prints the largest number
		System.out.println("The largest number is: " + largest);
		}	
}