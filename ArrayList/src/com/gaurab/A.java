package com.gaurab;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(21);
		list.add(11);
		list.add(31);
		list.add(51);

		// direct printing output
		System.out.println(list);

		// using for loop for printing output
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// using for each loop for printing output
		for (Integer al : list) {
			System.out.print(al + " ");
		}

	}

}
