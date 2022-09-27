package com.gaurab;

import java.util.Scanner;

public class INRintoUSD {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount into INR: ");
		double INR = scn.nextDouble();

		double converter = INR / 74.12;
		System.out.println("USD= " + converter);
	}

}
