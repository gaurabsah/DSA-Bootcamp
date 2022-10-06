package inheritance;

class Animal {
	public void eat() {
		System.out.println("I'm eating");
	}
}

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();

	}
}
