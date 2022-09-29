package com.gaurab;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scn.nextInt();
		System.out.print("Enter b: ");
		int b = scn.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.print("Value of a: " + a);
		System.out.println();
		System.out.print("Value of b: " + b);
	}

}
