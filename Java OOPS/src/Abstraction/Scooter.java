package Abstraction;

abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Car starts with key");

	}

}

public class Scooter extends Vehicle {

	@Override
	void start() {
		System.out.println("Scooter starts with kick");

	}

	public static void main(String[] args) {
//		Vehicle v= new Vehicle();

		Car c = new Car();
		c.start();

		Scooter s = new Scooter();
		s.start();

		Vehicle v = new Car();
		v.start();

		Vehicle v1 = new Scooter();
		v1.start();
	}

}
