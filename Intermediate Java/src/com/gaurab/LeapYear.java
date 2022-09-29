package com.gaurab;

import java.util.Scanner;

public class LeapYear {
	public static boolean leap(int year) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = scn.nextInt();
		System.out.println(leap(year));
	}

}
