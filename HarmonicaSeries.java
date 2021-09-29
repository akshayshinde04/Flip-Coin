package com.bridgelabz;

public class HarmonicaSeries {
	public static void main(String[] args) {
		double num = 6;
		double result = 0.0;
		System.out.println("The harmonic series is: ");
		for (double i = num; i > 0 ; i--) {
			result = result + (double) 1 / i;
			System.out.print(result + ", ");
		}
	}
}