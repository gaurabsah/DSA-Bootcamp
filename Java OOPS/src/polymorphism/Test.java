package polymorphism;

public class Test {
	void show() {
		System.out.println("No argument");
	}

	void show(int a) {
		System.out.println("Parameterised");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.show(10);
	}

}
