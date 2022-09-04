package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q26_06_16 {

	public static void main(String[] args) {
		String[] dizin = { "Türkiye", "Japonya", "Mogolistan", "Fransa", "Danimarka" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("give an input");
		String input = scanner.nextLine();
		String kontrol = "input not included";

		for (int i = 0; i < dizin.length; i++) {
			if (dizin[i].equalsIgnoreCase(input)) {
				kontrol = "input included";
			}

		}
		System.out.println(kontrol);
	}

}
