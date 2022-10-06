package com.gaurab;

public class Animal2 {
	int age;
	String color;

	public void initObj(int a, String c) {
		age = a;
		color = c;
	}

	public void display() {
		System.out.println(age + " " + color);
	}

	public static void main(String[] args) {
		Animal2 aa = new Animal2();
		aa.initObj(10, "black");
		aa.display();
	}

}
