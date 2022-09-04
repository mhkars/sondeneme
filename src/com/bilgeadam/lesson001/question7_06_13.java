package com.bilgeadam.lesson001;

import java.util.Scanner;

public class question7_06_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" bir sayi giriniz...:");
		int a = sc.nextInt();
		int i = 10;
		int x = 0;
		int t = 0;

		do {
			x = a % i;
			a = (a - x) / 10;
			t = t + x;

		} while (a != 0);
		System.out.print(t);

	}
}