package polymorphism;

class ABC {
	void run() {
		System.out.println("1");
	}
}

public class XYZ extends ABC {
	
	@Override
	void run() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		ABC a = new ABC();
		a.run(); // 1

		XYZ x = new XYZ();
		x.run(); // 2
	}

}
