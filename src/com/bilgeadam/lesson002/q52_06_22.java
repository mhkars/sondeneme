package com.bilgeadam.lesson002;

import java.util.Random;

public class q52_06_22 {

	public static void main(String[] args) {
		String kartTurleri[] = { "Kupa", "Maça", "Karo", "Sinek" };
		String kartNumaralari[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int deste[] = new int[52];
		String[] new_deste2 = new String[52];
		deste = deste_olustur(deste);
		String[] deste2 = new String[kartNumaralari.length * kartTurleri.length];
		deste2 = destele(kartTurleri, kartNumaralari, deste2);
//		for (String i : deste2) {
//			System.out.println(i);
//		}
		new_deste2 = mix(deste2);
		for (String i : new_deste2) {
			System.out.println(i);
		}
	}

	public static int[] deste_olustur(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
		}
		return dizi;
	}

	public static String[] destele(String[] dizi1, String[] dizi2, String[] dizi3) {
		int a = 0;

		for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j < dizi2.length; j++) {
				dizi3[a] = dizi1[i] + " " + dizi2[j];
				a++;
			}

		}
		return dizi3;
	}

	public static String[] mix(String[] dizi) {
		Random rand = new Random();

		for (int i = 0; i < dizi.length; i++) {
			int rando = rand.nextInt(52);
			String temp = dizi[rando];
			dizi[rando] = dizi[i];
			dizi[i] = temp;
		}
		return dizi;
	}
}
