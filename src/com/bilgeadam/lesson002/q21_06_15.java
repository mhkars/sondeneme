package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q21_06_15 {

	public static void main(String[] args) {
		System.out.println("Bir kelime giriniz...:");
		Scanner sc = new Scanner(System.in);
		String kelime = sc.nextLine();
		System.out.println("Bir harf giriniz...:");
		String harf = sc.nextLine();
		int t = 0;
		for (int i = 0; i < kelime.length(); i++) {
			int a = kelime.indexOf(harf, i);
			t++;

			System.out.print(a + "  ");
			System.out.println(t);

		}
	}
}
