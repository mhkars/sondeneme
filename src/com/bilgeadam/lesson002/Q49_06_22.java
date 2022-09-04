package com.bilgeadam.lesson002;

public class Q49_06_22 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 7 };
		ters(arr);

	}

	public static void ters(int[] dizi) {
		int[] new_dizi = new int[dizi.length];
		int i = 0;
		for (int j = dizi.length - 1; j > -1; j--) {
			new_dizi[i] = dizi[j];
			System.out.print(new_dizi[i] + " ");
			i++;

		}

	}

}
