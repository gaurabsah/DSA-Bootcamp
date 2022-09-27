package com.gaurab;

/*
 * Program to count the number occurrance
 */
import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: "); //3345545
		int num = scn.nextInt();

		int count = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem == 5) {
				count++;
			}
			num = num / 10;
		}
		System.out.println(count);
	}

}
