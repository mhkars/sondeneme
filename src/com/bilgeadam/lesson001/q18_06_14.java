package com.bilgeadam.lesson001;

import java.util.Scanner;

public class q18_06_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tarihi giriniz");
		int sayi = sc.nextInt();
		sayi = sayi % 7;

		switch (sayi) {
		case 1, 8, 15, 22:
			System.out.println("Pazartesi");
			break;
		case 2, 9, 16, 23, 30:
			System.out.println("Sali");
			break;
		case 3, 10, 17, 24, 31:
			System.out.println("Carsamba");
			break;
		case 4, 11, 18, 25:
			System.out.println("Persembe");
			break;
		case 5, 12, 19, 26:
			System.out.println("Cuma");
			break;
		case 6, 13, 20, 27:
			System.out.println("Cumartesi");
			break;
		case 7, 14, 21, 28:
			System.out.println("Paza");
			break;
		}

	}

}
