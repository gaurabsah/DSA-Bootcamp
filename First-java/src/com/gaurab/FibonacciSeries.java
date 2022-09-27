package com.gaurab;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		System.out.println("Fibonacci Series: ");

		int a = 0;
		int b = 1;
		int sum = 0;

		while (sum <= n) {
			System.out.print(sum + " ");
			a = b;
			b = sum;
			sum = a + b;
		}

	}

}
