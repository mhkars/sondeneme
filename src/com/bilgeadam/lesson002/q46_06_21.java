package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q46_06_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("dogum yilinizi giriniz...:");
		int yil = scanner.nextInt();
		int yas = 2022 - yil;
		int yuzyil = (yil / 100) + 1;
		System.out.println("yasiniz...: " + yas + "\n" + "yasadiginiz yuzyil...:" + yuzyil);

	}

}
