package com.bilgeadam.lesson002;

public class q29_06_16 {

	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int max_value = sayilar[0];
		int max_value2 = sayilar[0];
		int max = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > max_value) {
				max_value = sayilar[i];
				max = i;
			}
		}
		for (int i = 0; i < sayilar.length; i++) {
			if (max_value2 < sayilar[i] && sayilar[i] < max_value) {
				max_value2 = sayilar[i];
			}

		}
		System.out.println(max_value);
		System.out.println(max_value2);
	}
}