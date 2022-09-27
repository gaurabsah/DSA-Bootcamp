package com.gaurab;

import java.util.Scanner;

public class SumOfAllNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ans = 0;
		while (true) {
			System.out.print("Enter the integer: ");
			int integer = scn.nextInt();

			if (integer == 0) {
				break;
			} else {
				
				ans += integer;

			}
			System.out.println(ans);
		}
	}

}
