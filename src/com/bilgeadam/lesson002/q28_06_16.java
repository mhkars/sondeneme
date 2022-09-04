package com.bilgeadam.lesson002;

public class q28_06_16 {

	public static void main(String[] args) {
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int bir_adet = 0;
		int dort_adet = 0;
		boolean check = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 1) {
				bir_adet++;
			} else if (sayilar[i] == 4) {
				dort_adet++;

			}

		}
		if (bir_adet > dort_adet) {
			check = true;
		}
		System.out.println(check);
		System.out.println(bir_adet);
		System.out.println(dort_adet);
	}

}
