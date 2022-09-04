package com.person;

public class Man extends Person {

	public Man() {
		setRetireAge(65);
		setGender("Man".toUpperCase());
	}

	public Man(String name, int birthYear) {
		super(name, birthYear);
		setRetireAge(65);
		setGender("Man".toUpperCase());
	}

}
