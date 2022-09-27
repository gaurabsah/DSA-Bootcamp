package com.gaurab;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scn.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scn.nextInt();

		if (num1 > num2) {
			System.out.println("Largest number: " + num1);
		} else {
			System.out.println("Largest number: " + num2);
		}
	}

}
