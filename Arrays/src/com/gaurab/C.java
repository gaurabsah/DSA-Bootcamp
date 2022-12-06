package com.gaurab;

import java.util.Arrays;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		arr[2] = 55;
		System.out.println(Arrays.toString(arr));

	}

}
