package com.bilgeadam.lesson002;

import java.util.Scanner;

public class kitaplik_06_23 {
	static Scanner scanner = new Scanner(System.in);
	int i = 0;
	int t;

	public static void main(String[] args) {
		kitaplik_06_23 kitaplik = new kitaplik_06_23();
		int karar;

		int boyut = kitaplik.boyut();
		String books[] = new String[boyut];

		do {
			System.out.println("***** MENU *****");
			System.out.println("****************");
			System.out.println("1- Kitap Ekle");
			System.out.println("2-");
			System.out.println("3-");
			System.out.println("0- EXIT");
			karar = scanner.nextInt();
			scanner.nextLine();
			switch (karar) {
			case 1: {

				kitaplik.kitaplar(books);
				break;
			}
			case 2: {
				System.out.println("Aramak istediginiz kitabin ismini giriniz...:");
				String new_kitap = scanner.nextLine();
				System.out.println(kitaplik.kitap_kontrol(books, new_kitap));

			}
			default:
				break;
			}
		} while (karar != 0);
		for (int j = 0; j < books.length; j++) {
			System.out.println(books[j]);
		}
	}

//	public String menu() {
//		System.out.println("***** MENU *****");
//		System.out.println("****************");
//		System.out.println("1- Kitap Ekle");
//		System.out.println("2-");
//		System.out.println("3-");
//		System.out.println("0- EXIT");
//		return scanner.nextLine();
//
//	}

	public int boyut() {
		System.out.println("kitap adetini giriniz...:");

		int boyut = scanner.nextInt();
		scanner.nextLine();
		return boyut;

	}

	public boolean kitap_kontrol(String[] dizi, String kitap) {
		String k = null;
		for (int j = 0; j < dizi.length; j++) {
			k = dizi[j].toUpperCase();
			if (k.contains(kitap.toUpperCase()))
				return true;

		}
		return false;

	}

	public String[] kitaplar(String[] dizi) {

//		for (int i = 0; i < dizi.length; i++) {
		if (i < dizi.length) {
			System.out.println("Yazar ismini giriniz...:");
			String yazar = scanner.nextLine();
			System.out.println(" Kitap ismini giriniz...:");
			String kitap = scanner.nextLine();
			dizi[i] = yazar + " " + kitap;
			i++;
			return dizi;
		}

		else {
			System.out.println("kitaplik dolu");
		}
		return null;
	}

}
