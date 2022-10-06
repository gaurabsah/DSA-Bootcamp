package com.gaurab;

public class Star_pattern11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++) {
//				System.out.print("*");
				if (k > 1 && k < (i * 2) - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
