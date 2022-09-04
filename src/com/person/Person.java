package com.person;

public class Person {
	private String name;
	private int birthYear;
	private String gender;
	private int retireAge;

	public Person() {

	}

	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getRetireAge() {
		return retireAge;
	}

	public void setRetireAge(int retireAge) {
		this.retireAge = retireAge;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + ", gender=" + gender + ", retireAge=" + retireAge
				+ "]";
	}

	public int calculateAge() {

		return 2022 - getBirthYear();
	}

	public int howManyYears() {

		return getRetireAge() - calculateAge();

	}
}
