package com.para;

import java.util.Scanner;
import java.util.Stack;

public class Metin {
	static Stack<Character> liste = new Stack<Character>();
	static String input;

	public static void main(String[] args) {
		Metin metin = new Metin();
		metin.polindrom();
		System.out.println(metin.check(liste, input));

	}

	public void polindrom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("metin giriniz");
		input = scanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			liste.add(c);
		}
		liste.forEach(s -> System.out.print((s) + ","));

	}

	public boolean check(Stack<Character> stack, String string) {
		for (int i = 0; i < input.length(); i++) {
			if (stack.pop() != input.charAt(i))
				return false;
			else {

			}
		}
		return true;
	}
}
