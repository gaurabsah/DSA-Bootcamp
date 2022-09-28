package com.gaurab;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ans = 0;
		while (true) {
			System.out.println("Enter the number: ");
			int num = scn.nextInt();

			if (num == 0) {
				break;
			} else {
				ans = Math.max(ans, num);
			}
		}

		System.out.println("Largest Number: " + ans);
	}

}
