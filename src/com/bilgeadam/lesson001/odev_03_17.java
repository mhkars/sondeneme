package com.bilgeadam.lesson001;

import java.util.Scanner;

public class odev_03_17 {

	public static void main(String[] args) {
//		3- (Zor) : iki say� 124 ile 458 say�lar�n�n carp�m� nedir? 
//		 * bunlar birer Stringifadedir.
//		 * Bunlar� kullan�c�dan alabiliriz. Kolay olanlarda sadece (rakamlar olack
//		 * (0....9)) // temel i�lemlerimiz (topla,fark,�arp,b�l) i�lemin sonucunu
//		 * yazd�ram program.
		System.out.println("Lutfen sorunuzu turkce karakter icermeyecek sekilde giriniz...:");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String first_num;
		String second_num;

		String new_sen = sentence.replaceAll("[^-0-9]+", " ").trim();

		int index = new_sen.indexOf(" ");

		first_num = new_sen.substring(0, index);
		second_num = new_sen.substring(index + 1, new_sen.length());

		int first_number = Integer.parseInt(first_num);
		int second_number = Integer.parseInt(second_num);

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
