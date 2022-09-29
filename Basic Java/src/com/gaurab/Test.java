package com.gaurab;

public class Test {
	static int number;

	static public void main(String[] args) {
		int number = 1;
		Test test = new Test();
		if (test != null) {
			number = 2;
		}
		System.out.println(number);
	}

}
