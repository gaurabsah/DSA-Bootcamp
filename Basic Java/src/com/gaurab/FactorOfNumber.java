package com.gaurab;

import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
