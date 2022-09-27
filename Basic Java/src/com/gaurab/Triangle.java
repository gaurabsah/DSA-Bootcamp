package com.gaurab;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double b = scn.nextDouble();
		System.out.println("Enter the height: ");
		double h = scn.nextDouble();

		double areaOfTriangle = (b * h) / 2;
		System.out.println(areaOfTriangle);
	}

}
