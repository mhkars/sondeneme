package com.employee;

import java.util.Scanner;

public class Employee {
	Scanner scanner = new Scanner(System.in);

	private String name;
	private String title;
	private double salary;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", salary=" + salary + "]";
	}

	public double zam(int oran) {
		double increase = salary * oran;
		this.salary = salary + increase;
		return salary;

	}

}
