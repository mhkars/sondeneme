package com.bilgeadam.lesson001;

import java.util.Scanner;

public class q16_06_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("bir sayi giriniz...:");
		int sayi = sc.nextInt();
		int a = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				a = a + i;
			}
		}
		if (a == sayi) {
			System.out.println(sayi + " sayisi mukemmel sayidir");

		} else {
			System.out.println("sayi mukemmel sayi degildir.");
		}

	}
}