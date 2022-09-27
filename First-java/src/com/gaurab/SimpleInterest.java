package com.gaurab;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter principle: ");
		int p = scn.nextInt();
		System.out.println("Enter time: ");
		int t = scn.nextInt();
		System.out.println("Enter rate: ");
		int r = scn.nextInt();

		int SI = (p * t * r) / 100;

		System.out.println("Simple Interest= " + SI);
	}

}
