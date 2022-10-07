package inheritance;

class A2 {
	void showA() {
		System.out.println("A class");
	}
}

class B2 extends A2 {
	void showB() {
		System.out.println("B class");
	}
}

public class C1 extends A2 {
	void showC() {
		System.out.println("C class");
	}

	public static void main(String[] args) {
		A2 a = new A2();
		a.showA();
//		a.showB();
//		a.showC();

		B2 b = new B2();
		b.showA();
		b.showB();
//		b.showC();

		C1 c = new C1();
		c.showA();
//		c.showB();
		c.showC();
	}
}
