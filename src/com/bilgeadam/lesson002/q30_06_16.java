package com.bilgeadam.lesson002;

public class q30_06_16 {

	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 3, 4, 5, 6, 2, 7, 8, 9 };

		boolean check = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {

				check = true;
				break;
			}

		}

		System.out.println(check);

	}

}
