package com.database;

import java.util.Scanner;

public class Manager {

	IDatabase database;

	public Manager(IDatabase database) {
		this.database = database;
	}

	public void Menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1- add");
		System.out.println("2- sil");
		System.out.println("3- getir");
		System.out.println("4- güncelle");
		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
		case 1: {
			database.add();
			System.out.println("-------------");
			break;

		}
		case 2: {
			database.delete();
			System.out.println("-------------");
			break;
		}
		case 3: {
			database.get();
			System.out.println("-------------");
			break;
		}
		case 4: {
			database.update();
			System.out.println("-------------");
			break;
		}

		}

	}

}
