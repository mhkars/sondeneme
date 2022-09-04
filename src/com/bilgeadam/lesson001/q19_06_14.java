package com.bilgeadam.lesson001;

import java.util.Scanner;

public class q19_06_14 {

	public static void main(String[] args) {
		// Koç Burcu : 21 Mart - 20 Nisan
		//
		// Boğa Burcu : 21 Nisan - 21 Mayıs
		//
		// İkizler Burcu : 22 Mayıs - 22 Haziran
		//
		// Yengeç Burcu : 23 Haziran - 22 Temmuz
		//
		// Aslan Burcu : 23 Temmuz - 22 Ağustos
		//
		// Başak Burcu : 23 Ağustos - 22 Eylül
		//
		// Terazi Burcu : 23 Eylül - 22 Ekim
		//
		// Akrep Burcu : 23 Ekim - 21 Kasım
		//
		// Yay Burcu : 22 Kasım - 21 Aralık
		//
		// Oğlak Burcu : 22 Aralık - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 Şubat
		//
		// Balık Burcu : 20 Şubat - 20 Mart
		Scanner sc = new Scanner(System.in);
		System.out.println("Ayinizi giriniz");
		String m = sc.nextLine();
		System.out.println("Gununuzu giriniz");
		int d = sc.nextInt();
		if ((m == "Mart" && d > 21) || (m == "Nisan" && d < 21)) {
			System.out.println("Burcunuz Koç");
		}

	}

}
