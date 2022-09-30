package com.gaurab;

import java.util.Scanner;

public class PrimeNumber {
	public static String prime(int n) {
		int temp = 0;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			return "not a prime number";
		} else
			return "prime number";
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		System.out.println(prime(n));
	}

}
