package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q48_06_21 {

	static Scanner scanner = new Scanner(System.in);
	static String[] iller = { "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara", "Antalya", "Artvin", "Aydýn",
			"Balýkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum",
			"Denizli", "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir", "Gaziantep", "Giresun",
			"Gümüþhane", "Hakkari", "Hatay", "Isparta", "Mersin", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
			"Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraþ", "Mardin",
			"Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdað", "Tokat", "Trabzon", "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan", "Iðdýr", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	static String[] sesli = { "a", "e", "ý", "i", "o", "ö", "u", "ü" };

	public static void main(String[] args) {
//		plaka("Ankara", "Adana", "Afyon");
//		il();
//		String[] yeni_iller = sessiz();
//		kýsalt(yeni_iller); 
//		Byazdir(yeni_iller);
		Ayazdir(iller);
	}

//	public static void il() {
////		System.out.println("Harf giriniz ....:");
////		Scanner scanner = new Scanner(System.in);
////		String harf = scanner.nextLine();
//		for (int i = 0; i < iller.length; i++) {
////			if (harf.equalsIgnoreCase(iller[i].substring(0, 1))) {
//			if (i < 9) {
//				System.out.println("0" + (i + 1) + "-" + iller[i]);
//			} else {
//				System.out.println((i + 1) + "-" + iller[i]);
//			}
//		}
////	}
//	public static void plaka(String... ill) {
////		System.out.println("Il giriniz...: ");
////		String il = scanner.nextLine();
//		for (String il : ill) {
//			for (int i = 0; i < iller.length; i++) {
//				if (il.equalsIgnoreCase(iller[i])) {
//					if (i < 9)
//						System.out.println(il + " plakasi: 0" + (i + 1));
//					else {
//						System.out.println(il + " plakasi " + (i + 1));
//					}
//				}
//			}
//
//		}
//	}

	public static void kýsalt(String[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].length() < 3)
				System.out.println(dizi[i] + "...");
			else {
				System.out.println(dizi[i].substring(0, 3) + "...");
			}

		}
	}

	public static String[] sessiz() {
		String[] sesli = { "a", "e", "ý", "i", "o", "ö", "u", "ü" };
		String[] yeni_iller = new String[iller.length];

		for (int i = 0; i < iller.length; i++) {

			for (int j = 0; j < (sesli.length); j++) {

				if (iller[i].contains(sesli[j])) {
					iller[i] = iller[i].replace(sesli[j], "");
				}

			}
			yeni_iller[i] = iller[i];

		}
		return yeni_iller;

	}

	public static void Byazdir(String[] dizi) {
		int a = 1;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].startsWith("B")) {
				if (dizi[i].length() < 3)
					System.out.println(a + "-" + dizi[i]);
				else {
					System.out.println(a + "-" + dizi[i].substring(0, 3));
				}
				a++;

			}
		}

	}

	public static void Ayazdir(String[] dizi) {

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].charAt(1) == 'a') {
				System.out.println(dizi[i].substring(0, 3).toUpperCase());
			}
		}
	}
}
