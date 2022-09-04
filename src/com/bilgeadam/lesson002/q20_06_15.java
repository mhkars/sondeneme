package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q20_06_15 {

	public static void main(String[] args) {
		System.out.println("Bir kelime giriniz...:");
		Scanner sc = new Scanner(System.in);
		String kelime = sc.nextLine();
		int sayi = kelime.length();
		for (int i = 0; i < sayi; i++) {

			System.out.println(i + "-" + kelime.charAt(i));
		}
	}

}
