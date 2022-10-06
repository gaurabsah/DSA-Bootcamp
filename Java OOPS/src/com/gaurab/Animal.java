package com.gaurab;

class Bird {
	public void fly() {
		System.out.println("I am flying");
	}
}

class Animal {
	public void eat() {
		System.out.println("I am eating");
	}

	public static void main(String[] args) {
		System.out.println("1");

		Animal dog = new Animal();
		dog.eat();
		dog.run();

		Bird chiddi = new Bird();
		chiddi.fly();

	}

	public void run() {
		System.out.println("I am running");
	}

}
