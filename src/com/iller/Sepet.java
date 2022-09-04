package com.iller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sepet {
	Scanner scanner = new Scanner(System.in);
	String product[] = { "Cips", "Kola", "Seker", "Yag", "Un", "Ekmek", "Cay", "Yumurta", "Yogurt", "Sut" };
	List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		Sepet sepet = new Sepet();
		sepet.menu();
	}

	public void menu() {
		int input = 0;
		do {
			System.out.println("***************");
			System.out.println("1- Urun Listesi");
			System.out.println("2- Urun Ekle");
			System.out.println("3- Speti Goster");
			System.out.println("***************");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				urunGoster(product);
				break;
			case 2:
				urunEkle(product, list);
				break;
			case 3:
				sepetGoster(list);

				break;

			default:
				break;
			}
		} while (input != 0);
	}

	private void urunGoster(String[] urunler) {

		for (int i = 0; i < urunler.length; i++) {

			System.out.println(i + 1 + "- " + urunler[i]);
		}
	}

	private void urunEkle(String[] array, List<String> liste) {
		System.out.println("Secmek istediginiz urun adetini giriniz...:");
		int pcs = scanner.nextInt();
		for (int i = 0; i < pcs; i++) {
			System.out.println("Sectiginiz urunlerin numarasini giriniz...:");
			int num = scanner.nextInt();
			liste.add(array[(num - 1)]);
		}
	}

	private void sepetGoster(List<String> liste) {

		for (int i = 0; i < liste.size(); i++) {

			System.out.println(liste.get(i));
		}
	}
}
