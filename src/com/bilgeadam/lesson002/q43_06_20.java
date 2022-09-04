package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q43_06_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kac adet rakam");

		int adet = scanner.nextInt();

		switch (adet) {
		case 2:
			int sayý_1 = sayý();
			int sayý_2 = sayý();
			System.out.println("sayilarin toplami : " + topla(sayý_1, sayý_2));
			break;

		case 3:
			int sayý_11 = sayý();
			int sayý_21 = sayý();
			int sayý_33 = sayý();
			System.out.println("sayilarin toplami : " + topla(sayý_11, sayý_21, sayý_33));
			break;

		}

	}

	public static int sayý() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int a = scanner.nextInt();
		return a;
	}

	public static int topla(int say1, int say2) {
		int toplam = say1 + say2;
		return toplam;
	}

	public static int topla(int say1, int say2, int say3) {
		int toplam = say1 + say2 + say3;
		return toplam;
	}

}
