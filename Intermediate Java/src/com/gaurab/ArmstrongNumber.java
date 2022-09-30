package com.gaurab;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();

		int t1 = n;
		int leng = 0;
		while (t1 != 0) {

			t1 = t1 / 10;
			leng = leng + 1;
		}

		int t2 = n;
		int rem, arm = 0;
		while (t2 != 0) {
			rem = t2 % 10;
			int mul = 1;
			for (int i = 1; i <= leng; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}

		if (arm == n) {
			System.out.println(n + " is a armstrong number");
		} else {
			System.out.println(n + " is not a armstrong number");
		}
	}

}
