package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q31_06_17 {

	public static void main(String[] args) {
		double a = 0;
		double b = 1;
		double total = 0;
		double sayi = 0;
		Scanner scanner = new Scanner(System.in);

		while (a != b) {
			b = a;
			System.out.println("Lutfen islem yapmak istediginiz sayiyi giriniz");
			a = scanner.nextInt();
			total += a;
			sayi++;

		}
		System.out.println((double) (total / sayi));

	}

}
