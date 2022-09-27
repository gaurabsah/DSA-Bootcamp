package com.gaurab;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r = scn.nextDouble();

		double areaOfCircle = Math.PI * r * r;
		System.out.println(areaOfCircle);
	}

}
