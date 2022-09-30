package com.gaurab;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int n) {
		int rem, rev = 0;
		while (n != 0) {
			rem = n % 10; // for remainder
			rev = rev * 10 + rem;
			n = n / 10; // for quotient number
		}
		return rev;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		int ans = reverse(n);
		System.out.println("Reverse Number of " + n + " is: " + ans);
	}

}
