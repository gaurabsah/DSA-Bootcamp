package com.gaurab;

import java.util.Scanner;

public class ArrayElementPresentOrNot {

	public static int arrInd(int arr[], int a) {
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int[] arr = { 1, 2, 3, 4, 5 };
		int ans = arrInd(arr, a);
		System.out.println(a + " Is present at Index " + ans);
	}

}
