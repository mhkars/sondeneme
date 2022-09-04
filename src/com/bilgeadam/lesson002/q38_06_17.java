package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q38_06_17 {

	public static void main(String[] args) {
		String[] tur = { "ý", "ö", "ü", "þ", "ð", "ç" };
		String[] eng = { "i", "o", "u", "s", "g", "c" };
		System.out.println("input a text...:");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		for (int i = 0; i < tur.length; i++) {
			if (text.contains(tur[i])) {
				int a = text.indexOf(tur[i]);
				text = text.replace(tur[i], eng[i]);

			}
		}
		System.out.println(text);

	}

}
