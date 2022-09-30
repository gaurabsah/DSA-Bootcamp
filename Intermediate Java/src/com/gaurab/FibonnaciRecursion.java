package com.gaurab;

import java.util.Scanner;

public class FibonnaciRecursion {
	static int a = 0;
	static int b = 1;
	static int c;

	public static void fibo(int n) {
		if (n >= 1) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			fibo(n - 1);

		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		System.out.print(a + " " + b);
		fibo(n);

	}

}
