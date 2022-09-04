package com.bilgeadam.lesson001;

import java.util.Scanner;

public class odev_06_17_1 {

	public static void main(String[] args) {
		/**
		 * // * 1- (Kolay) : 5 ile 7 nin toplamý nedir? -> 12 // 2- (Kolay) : iki sayým
		 * var biri 9 diðeri 2 bunlarýn çarpýmý nedir? -> 18 // *
		 */
		System.out.println("Sorunuzu giriniz...:");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		char first_num = 0;
		char second_num = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isDigit(sentence.charAt(i))) {
				first_num = second_num;
				second_num = sentence.charAt(i);
			}
		}
		int first_number = Character.getNumericValue(first_num);
		int second_number = Character.getNumericValue(second_num);
		if (sentence.contains("topla"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "+" + second_number + "=" + (first_number + second_number));
		else if (sentence.contains("fark"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "-" + second_number + "=" + (first_number - second_number));
		else if (sentence.contains("carp"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "*" + second_number + "=" + (first_number * second_number));
		else if (sentence.contains("bol"))
			System.out.println(
					"Sorunuzun cozumu : " + first_number + "/" + second_number + "=" + (first_number / second_number));
	}

}
