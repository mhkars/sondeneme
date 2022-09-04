package com.bilgeadam.lesson002;

public class q27_06_16 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int toplam = 0;
		String tek_sayilar = "";
		String cift_sayilar = "";

		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
			if (sayilar[i] % 2 == 0) {

				cift_sayilar = cift_sayilar + sayilar[i] + ", ";

			} else {

				tek_sayilar = tek_sayilar + sayilar[i] + ", ";
			}
		}
		System.out.println(toplam);
		System.out.println(tek_sayilar);
		System.out.println(cift_sayilar);
	}

}
