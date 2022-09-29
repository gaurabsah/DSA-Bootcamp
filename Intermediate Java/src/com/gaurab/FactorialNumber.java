package com.gaurab;

import java.util.Scanner;

// 5!=5*4*3*2*1

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		int fact = 1;

//      for(int i=n;i>=1;i--)

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
