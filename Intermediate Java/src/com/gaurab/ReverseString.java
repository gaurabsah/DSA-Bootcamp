package com.gaurab;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String name) {
		String revStr = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revStr = revStr + name.charAt(i);
		}
		return revStr;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = scn.nextLine();
		String ans = reverse(name);
		System.out.println(ans);
	}

}
