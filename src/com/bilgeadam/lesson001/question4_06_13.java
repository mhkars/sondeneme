package com.bilgeadam.lesson001;

import java.util.Scanner;

public class question4_06_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("sayi girin");
		int a = sc.nextInt();
		int i;
		for (i = 1; i < 10; i++) {
			System.out.println(a + "x" + i + "=" + a * i);
		}
	}

}
