package com.gaurab;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		System.out.print("Enter the value of a: ");
		int a = scn.nextInt();
		System.out.print("Enter the value of b: ");
		int b = scn.nextInt();

		int c;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
