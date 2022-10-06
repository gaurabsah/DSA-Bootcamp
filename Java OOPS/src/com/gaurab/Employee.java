package com.gaurab;

public class Employee {
	int emp_id;
	String name;

	public Employee(int emp_id, String name) {
		this.emp_id = emp_id;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Gaurab");
		Employee emp1 = new Employee(102, "Saurab");

		System.out.println(emp.emp_id + " " + emp.name);
		System.out.println(emp1.emp_id + " " + emp1.name);
	}

}
