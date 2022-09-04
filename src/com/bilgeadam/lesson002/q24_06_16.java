package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q24_06_16 {

	public static void main(String[] args) {
		System.out.println("IBAN giriniz..:");
		Scanner scanner = new Scanner(System.in);
		String iban = scanner.nextLine();
		if (iban.startsWith("TR")) {
			System.out.println("yurt ici islemler");
			if (iban.endsWith("5001")) {
				System.out.println("Ziraat");
			} else if (iban.endsWith("5002")) {
				System.out.println("Garanti");
			} else if (iban.endsWith("5003")) {
				System.out.println("is bankasi");
			}

		} else if (iban.startsWith("OTH")) {
			System.out.println("Yurt disi");
			if (iban.endsWith("2000")) {
				System.out.println("Kita ici islemler");
				iban = iban.replace("OTH", "KI");
			} else {
				System.out.println("Kita disi islemler");
				iban = iban.replace("OTH", "KD");
			}

		}
		System.out.println(iban);

	}
}
