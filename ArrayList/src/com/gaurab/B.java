package com.gaurab;

import java.util.ArrayList;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(5);

		for (int i = 0; i < 5; i++) {
			list.add(scn.nextInt());
		}

		// get element at any index
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
	}

}
