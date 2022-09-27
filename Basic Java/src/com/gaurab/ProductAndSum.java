package com.gaurab;

import java.util.Scanner;

public class ProductAndSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int num = scn.nextInt();

		int productOfDigits = 1;
		int sumOfDigits = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			productOfDigits *= lastDigit;
			sumOfDigits += lastDigit;
			num /= 10;
		}
		System.out.println(productOfDigits - sumOfDigits);
	}

}
