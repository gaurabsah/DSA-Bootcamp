package com.gaurab;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(
				"Enter the operator: \n 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division : ");
		int operator = scn.nextInt();
		System.out.println("Enter first number: ");
		int num1 = scn.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scn.nextInt();

		if (operator == 1) {
			int sum = num1 + num2;
			System.out.println("Addition: " + sum);
		} else if (operator == 2) {
			int sub = num1 - num2;
			System.out.println("Substraction: " + sub);
		} else if (operator == 3) {
			int mul = num1 * num2;
			System.out.println("Multiplication: " + mul);
		} else {
			int div = num1 / num2;
			System.out.println("Division: " + div);
		}

	}

}
