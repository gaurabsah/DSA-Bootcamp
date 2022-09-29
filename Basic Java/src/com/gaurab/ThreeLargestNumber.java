package com.gaurab;

import java.util.Scanner;

public class ThreeLargestNumber {

	public static int largest(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = scn.nextInt();
		System.out.print("Enter the second number: ");
		int b = scn.nextInt();
		System.out.print("Enter the third number: ");
		int c = scn.nextInt();
		int ans = largest(a, b, c);
		System.out.println("The Largest Number is: " + ans);

	}

}
