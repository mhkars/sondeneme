package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q42_06_20 {

	public static void main(String[] args) {

		int sayi_1 = sayı();
		int sayi_2 = sayı();

		System.out.println(obeb(sayi_1, sayi_2));
		System.out.println(okek(sayi_1, sayi_2));

	}

	public static int sayı() {
		System.out.println("bir sayı giriniz");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		return sayi;

	}

	public static int obeb(int say, int say2) {
		int ebob = 0;
		for (int i = 1; i < say; i++) {
			if (say % i == 0 && say2 % i == 0) {
				ebob = i;
			}

		}
		return ebob;

	}

	public static int okek(int say, int say2) {
		int ekok = say * say2 / obeb(say, say2);
		return ekok;
	}
}
