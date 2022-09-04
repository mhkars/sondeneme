package com.bilgeadam.lesson002;

public class q37_06_17 {

	public static void main(String[] args) {
		int[] yeni_dizi = new int[16];
		int t = 0;
		int[][] matris = { { 56, 23, 678, 231 }, { 234, 21, 78, 26 }, { 654, 33, 32, 67 }, { 189, 35, 56, 89 }

		};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (matris[i][j] % 2 != 0) {
					yeni_dizi[t] = matris[i][j];
					t++;
				}
			}

		}
		for (int l = 0; l < yeni_dizi.length; l++) {
			System.out.println(yeni_dizi[l]);

		}
	}
}
