package com.bilgeadam.lesson002;

import java.util.Random;

public class q47_06_21 {

	public static void main(String[] args) {
//		Random rad = new Random();
//		int a = boyut();

		int[] dizi = new int[10];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = random();
		}
		int ortalama = average(dizi);
		System.out.println(ortalama);

	}

	public static int random() {
		Random rad = new Random();
		int a = rad.nextInt(500);
		return a;
	}

	public static int average(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {

			toplam += dizi[i];
		}
		return toplam / dizi.length;

	}

}
