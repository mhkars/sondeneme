package com.bilgeadam.lesson001;

public class question2_06_13 {
	public static void main(String[] args) {
		int n = 5;
		String karakter = "*";
		for (int i = 1; i <= (n * n); i++) {
			if (i <= n || i > n * (n - 1) || i % n == 1 || i % n == 0) {
				System.out.print(karakter + " ");
			} else {
				System.out.print("  ");
			}
			if (i % n == 0) {
				System.out.println(" ");
			}
		}
	}
}
