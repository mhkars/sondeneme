package com.person;

import java.util.Scanner;

public class Manager {
	Scanner scanner = new Scanner(System.in);

	public Person chooseGender() {

		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
		case 1: {
			Man man = new Man();
			return infoEnter(man);

		}
		case 2: {
			Woman woman = new Woman();
			return infoEnter(woman);
		}
		}
		return null;
	}

	public Person infoEnter(Person person) {

		System.out.println("Name..:");
		person.setName(scanner.nextLine());
		System.out.println("Date..:");
		person.setBirthYear(scanner.nextInt());
		return person;

	}
}
