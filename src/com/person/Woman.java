package com.person;

public class Woman extends Person {

	public Woman() {
		setRetireAge(60);
		setGender("Woman".toUpperCase());
	}

	public Woman(String name, int birthYear) {
		super(name, birthYear);
		setRetireAge(60);
		setGender("Woman".toUpperCase());

	}

}
