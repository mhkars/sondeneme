package com.bilgeadam.lesson001;

import java.util.Scanner;

public class question3_06_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" bir sayi giriniz...:");
		int a = sc.nextInt();
		int i;
		int fakt_a = 1;
		for (i = 1; i <= a; i++) {
			fakt_a *= i;

		}
		System.out.print(fakt_a);

	}

}
