package com.bilgeadam.lesson002;

public class q51_06_22 {

	public static void main(String[] args) {
		int[] nums = { 10, 7, 4, 5, 6, 8, 20, 5 };
		System.out.println(fark(nums));

	}

	public static boolean fark(int[] dizi) {
		for (int i = 0; i < dizi.length - 1; i++) {
			if (dizi[i] + 1 == dizi[i + 1]) {
				if (dizi[i + 1] + 1 == dizi[i + 2])
					return true;
			}
		}
		return false;
	}
}
