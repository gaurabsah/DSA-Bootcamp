package com.gaurab;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double l = scn.nextDouble();
		System.out.println("Enter the breadth: ");
		double b = scn.nextDouble();

		double areaOfRectangle = l * b;
		System.out.println(areaOfRectangle);
	}

}
