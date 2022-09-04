package com.bilgeadam.lesson002;

import java.util.Scanner;

public class q22_06_15 {
	public static void main(String[] args) {

		// 1-Dýþarýdan bir kelime girilsin eðer kelimemizin
		// için de 'a' harfi varsa kaç tane olduðunu ve index numaralarýný yazdýrýn.
		//
		// 2-Dýþarýdan bir kelime giriniz daha sonra deðiþtirmek istediðiniz harfi
		// giriniz
		// daha sonra hangi harfle deðiþtireceðinizi giriniz
		// Eðer kelimemiz içerisinde o harf varsa deðiþtirsin
		//
		// 3-Dýþarýdan Girilen bir kelimeyi ters çevirip yazdýralým.
		//
		// 4-Dýþarýdan 5 adet kelime girelim her kelimede a, b veya c ile baþlayýp
		// baþlamadýðýmýzý kontrol etsin
		// (a, b,c ile baþlayanlar için ayrý ayrý sayfa açýldýðýný düþünün elimizde) a
		// lar bir sayfa b ler bir sayfa c ler bir
		// sayfa gibi düþünelim diðer harfle baþlayanlar için ise ayrý bir sayfa
		// düþünelim girilen
		// 5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa oluðunu ekrana
		// yazdýralým.
		Scanner sc = new Scanner(System.in);
		boolean menuTekrar = true;
		String menuMetni = "";

		StringBuilder stringBuilder = new StringBuilder();
		while (menuTekrar) {
			System.out.println("========String Ýþlemleri======");
			System.out.println("1-Harf Saydýrma");
			System.out.println("2-Harlerin Yerlerini Deðiþtirme");
			System.out.println("3-Kelimeyi ters çevirerek yazdýrma");
			System.out.println("4-Harflere Göre Sayfa sayýsý belirleme Yöntem-1-");
			System.out.println("4-Harflere Göre Sayfa sayýsý belirleme Yöntem-2-");
			System.out.println("0-çýkýþ");
			System.out.println("==============");
			System.out.println(menuMetni);
			int input = sc.nextInt();
			sc.nextLine();

			switch (input) {

			case 1 -> {

				System.out.println("Bir kelime giriniz...:");

				String kelime = sc.nextLine();
				System.out.println("Bir harf giriniz...:");
				String harf = sc.nextLine();
				String index = "";

				int t = 0;
				for (int i = 0; i < kelime.length(); i++) {
					if (kelime.charAt(i) == 'a') {
						t++;
						index = index + i + ",";

					}

				}
				System.out.println(index);
				System.out.println(t);
			}
			case 2 -> {
				while (true) {
					System.out.println("Lutfen bir kelime giriniz");
					String yeni_kelime = sc.nextLine();
					System.out.println("degistirmek istediginiz harfi giriniz");
					String degisecek_harf = sc.nextLine();
					if (yeni_kelime.contains(degisecek_harf)) {
						System.out.println("yeni harfi giriniz");
						String yeni_harf = sc.nextLine();
						yeni_kelime = yeni_kelime.replace(degisecek_harf, yeni_harf);
						System.out.println(yeni_kelime);
						break;
					} else {
						System.out.println("kelime degistirmek istediginiz harfi icermemektedir");
					}
				}

			}
			case 3 -> {

				String daha_en_yeni_kelime = "";
				System.out.println("bir kelime giriniz");
				String en_yeni_kelime = sc.nextLine();
				for (int i = en_yeni_kelime.length() - 1; i >= 0; i--) {

					daha_en_yeni_kelime = daha_en_yeni_kelime + en_yeni_kelime.charAt(i);

				}
				System.out.println(daha_en_yeni_kelime);

			}
			case 4 -> {
				int sayac = 5;
				
				do {
					System.out.println("bir kelime giriniz...:");
					String new_word = sc.nextLine();
					if (new_word.startsWith("a")){
						
					}
				}
				while(sayac>0)
				
			}
			
			}
		}
	}
}
