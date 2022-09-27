package com.gaurab;

import java.util.Scanner;

public class GreetingMessage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scn.nextLine();

		System.out.println("Hello " + name);
	}

}
