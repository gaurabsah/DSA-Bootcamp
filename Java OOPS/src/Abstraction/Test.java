package Abstraction;

/*
 * Interface:-
 *    It supports multiple inheritance.
 *    We can have default and static methods in interface.
 *    All variables declared in interface are public static final
 */

interface A {
	int a = 10;

	void show();
}

interface B {
	void display();
}

public class Test implements A, B {

	@Override
	public void show() {
		System.out.println("Overriding Method");
	}

	public static void main(String[] args) {
//		A a = new A();

		Test t = new Test();
		t.show();
		t.display();

		A a = new Test();
		a.show();

		B b = new Test();
		b.display();

	}

	@Override
	public void display() {
		System.out.println("Supports multiple inheritance");

	}

}
