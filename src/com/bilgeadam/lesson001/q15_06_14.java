package com.bilgeadam.lesson001;

import java.util.Scanner;

public class q15_06_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("bir sayi giriniz...:");
		double a = sc.nextDouble();
		while (a >= 5) {
			a = a / 5;
		}

		if (a == 1) {
			System.out.println("Sayi besin kuvvetidir" + a);

		} else {
			System.out.println("Sayi 5 in kuvveti degildir." + a);
		}
	}

}
