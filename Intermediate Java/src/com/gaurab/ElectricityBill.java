package com.gaurab;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the units: ");
		int units = scn.nextInt();
		double billPay = 0;
		if (units < 100) {
			billPay = units * 1.20;
		} else if (units < 300) {
			billPay = 100 * 1.20 + (units - 100) * 2;
		} else if (units > 300) {
			billPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
		}
		System.out.println("Bill to pay : " + billPay);
	}

}
