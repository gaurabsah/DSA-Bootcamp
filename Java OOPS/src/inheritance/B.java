package inheritance;

class A {
	void showA() {
		System.out.println("A class");
	}
}

public class B extends A {
	void showB() {
		System.out.println("B class");
	}

	public static void main(String[] args) {
		A a = new A();
		a.showA();
//		a.showB();

		B b = new B();
		b.showA();
		b.showB();
	}

}
