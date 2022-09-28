package com.gaurab;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		System.out.println("Factorial of " + n + " is: " + fact(n));
	}

}
