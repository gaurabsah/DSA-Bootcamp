package com.gaurab;

import java.util.Scanner;

public class Addition {
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scn.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scn.nextInt();
		System.out.println("The sum of " + num1 + " & " + num2 + " is " + add(num1, num2));
	}

}
