package com.gaurab;

import java.util.Scanner;

public class PalindromeNumber {
	public static int reverseNumber(int n) {
		int rem, rev = 0;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();

		System.out.println("Reverse number: " + reverseNumber(n));

		if (n == reverseNumber(n)) {
			System.out.println(n + " = " + reverseNumber(n) + " hence, it is palindrome");
		} else {
			System.out.println(n + " != " + reverseNumber(n) + " hence, it is not a palindrome");
		}

	}

}
