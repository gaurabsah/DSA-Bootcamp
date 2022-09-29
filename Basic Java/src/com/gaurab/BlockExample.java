package com.gaurab;

public class BlockExample {
	static String str2 = "JAVA1";
	{
		String str2 = "JAVA2";
	}

	public static void main(String[] args) {
		String str2 = "JAVA3";
		System.out.println(str2);
	}

}
