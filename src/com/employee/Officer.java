package com.employee;

public class Officer extends Employee {

	public Officer(String name) {
		super(name);
		setSalary(8000);
		setTitle("Worker");

	}

	public Officer(String name, double salary) {
		super(name, salary);
		setTitle(salary);

	}

	public void setTitle(double salary) {
		if (salary >= 12000) {
			setTitle("Senior Worker");
		} else if (salary >= 8000) {
			setTitle("Çalýþan");
		} else {
			setTitle("Stajyer");
		}

	}

	public double zam(int oran) {
		setSalary(super.zam(oran));
		setTitle(getSalary());
		return getSalary();
	}
}
