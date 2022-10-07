package inheritance;

class A1 {
	void showA() {
		System.out.println("A class");
	}
}

class B1 extends A {
	void showB() {
		System.out.println("B class");
	}
}

public class C extends B {
	void showC() {
		System.out.println("C class");
	}

	public static void main(String[] args) {
		A1 a = new A1();
		a.showA();
//		a.showB();
//		a.showC();

		B1 b = new B1();
		b.showA();
		b.showB();
//		b.showC();

		C c = new C();
		c.showA();
		c.showB();
		c.showC();
	}

}
