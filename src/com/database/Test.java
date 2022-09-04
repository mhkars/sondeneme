package com.database;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Manager manager;
		Scanner scanner = new Scanner(System.in);

		System.out.println("1- Mysql");
		System.out.println("2- Oracle");
		int desicion = scanner.nextInt();

		switch (desicion) {
		case 1: {
			manager = new Manager(new Mysql());
			manager.database.login();
			manager.Menu();
			break;
		}
		case 2: {
			manager = new Manager(new Oracle());
			manager.database.login();
			manager.Menu();
			break;

		}

		}
	}
}