package com.gaurab;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = scn.nextInt();
		System.out.print("Enter num2: ");
		int num2 = scn.nextInt();
		System.out.print("Enter the Operation \n 1. + \n 2. - \n 3. * \n 4. / \n :");
		String op = scn.next();
		int result;

		switch (op) {
		case "+":
			result = num1 + num2;
			System.out.println("Result: " + result);
			break;

		case "-":
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;

		case "*":
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;

		case "/":
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;

		default:
			System.out.println("Invalid Operation");
		}
	}

}
