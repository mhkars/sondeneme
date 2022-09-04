package com.employee;

public class Engineer extends Employee {

	public Engineer(String name, double salary) {
		super(name, salary);
		setTitle(salary);

	}

	public Engineer(String name) {
		super(name);
		setSalary(10000);
		setTitle("Engineer");
	}

	public void setTitle(double salary) {
		if (salary > 17000) {
			setTitle("Senior Engineer");
		} else if (salary > 12000) {
			setTitle("Master Engineer");
		} else if (salary > 10000) {
			setTitle("Engineer");
		} else {
			setTitle("Stajier Engineer");
		}
	}

	public double zam(int oran) {
		setSalary(super.zam(oran) + 250);
		setTitle(getSalary());
		return getSalary();

	}
}
