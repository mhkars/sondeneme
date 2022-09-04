package com.bilgeadam.lesson001;

import java.util.Scanner;

public class question010_06_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" bir sayi giriniz...:");
		int a;
		int i = 0;
		int x = 0;

		do {
			a = sc.nextInt();
			x = x + a;
			i++;

		} while (a != 0);
		System.out.print("toplam: " + x + " ortalama : " + (x / i));

	}

}
