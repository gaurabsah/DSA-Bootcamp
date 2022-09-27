package com.gaurab;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scn.nextInt();

		int ans = 0;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			ans = ans * 10 + rem;
		}
		System.out.println(ans);
	}

}
