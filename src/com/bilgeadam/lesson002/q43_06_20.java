package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q43_06_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kac adet rakam");

		int adet = scanner.nextInt();

		switch (adet) {
		case 2:
			int say�_1 = say�();
			int say�_2 = say�();
			System.out.println("sayilarin toplami : " + topla(say�_1, say�_2));
			break;

		case 3:
			int say�_11 = say�();
			int say�_21 = say�();
			int say�_33 = say�();
			System.out.println("sayilarin toplami : " + topla(say�_11, say�_21, say�_33));
			break;

		}

	}

	public static int say�() {
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
