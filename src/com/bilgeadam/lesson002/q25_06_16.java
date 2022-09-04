package com.bilgeadam.lesson002;

public class q25_06_16 {

	public static void main(String[] args) {
		int[] dizi = { 19, 22, 50, 11, 36, 48 };
		int max = dizi[0];
		int min = dizi[0];
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] < min) {
				min = dizi[i];

			} else if (dizi[i] > max) {
				max = dizi[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
