package com.bilgeadam.lesson001;

import java.util.Scanner;

public class q17_06_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sayi = sc.nextInt();
		int max = 0;
		int min = 100;
		int i = 0;

		while (i < 5) {
			System.out.println("bir sayi giriniz...:");
			sayi = sc.nextInt();
			if (sayi > 0 && sayi < 101) {

				if (sayi > max) {
					max = sayi;
				}
				if (sayi < min) {
					min = sayi;
				}
				i++;
			}
		}

		System.out.println("en buyuk sayi " + max);

		System.out.println("en kucuk sayi " + min);
	}

}
