package com.gaurab;

import java.util.Scanner;

public class Swap2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scn.nextInt();
		System.out.print("Enter b: ");
		int b = scn.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.print("Value of a: " + a);
		System.out.println();
		System.out.print("Value of b: " + b);
	}

}
