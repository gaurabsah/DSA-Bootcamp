package com.gaurab;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String revStr = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scn.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		if (str.equals(revStr)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}

}
