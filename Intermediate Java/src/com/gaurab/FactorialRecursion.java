package com.gaurab;

import java.util.Scanner;

public class FactorialRecursion {
	int fact = 1;

	public int calFact(int n) {
		if (n > 1) {
			fact = fact * n;
			calFact(n - 1);
		}
		return fact;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();

		FactorialRecursion a = new FactorialRecursion();
		int result = a.calFact(n);
		System.out.println(result);

	}

}
