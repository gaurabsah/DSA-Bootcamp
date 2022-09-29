package com.gaurab;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();

		for (int i = 0; i <= 10; i++) {
			int ans = n * i;
			System.out.println(n + " * " + i + " = " + ans);
		}
	}

}
