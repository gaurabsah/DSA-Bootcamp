package com.gaurab;

public class Variables {
	int a;   // instance variable
	static int b;  // static variable

	public static void main(String[] args) {
		int c = 5;  //local variable
		Variables var = new Variables();
		int d = var.a + b + c;
		System.out.println(d);
		System.out.println(var.a);
		System.out.println(b);
	}

}

/*
 * Local variable: is inside method, constructor or block only. 
 * it does not have default value so we have to initialise it otherwise gives error
 * 
 * Instance Variable: is always outside method, to access it inside static method we
 * have to create object of the class. default value is 0
 * 
 * Static variable: is always belongs to class. default value is 0
*/