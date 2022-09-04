package com.bilgeadam.lesson002.uygulama;

import java.util.Scanner;

public class Uygulama {

	Kullanýcý[] kullanýcýlar = new Kullanýcý[3];
	int index;
	int ziyaretciSayisi;
	static Scanner scanner = new Scanner(System.in);

	public void menu() {
		int input = 0;
		do {
			System.out.println("**********Uygulama Giris Ekrani**********");
			System.out.println("Ziyaretci Sayisi: " + ziyaretciSayisi);
			System.out.println("Kullanici Sayisi: ");
			System.out.println("-----------------------------------------");
			System.out.println("1- Kayit Ol");
			System.out.println("2- Giris Yap");
			System.out.println("3- Cikis Yap");
			System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz");
			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				kayitOl();
				break;
			case 2:
				girisYap();

			}

		} while (input != 0);

	}

	public void kayitOl() {
		if (kullanýcýlar[kullanýcýlar.length - 1] != null) {
			System.out.println("Uygulama kapasitesi dolu.");
		} else {
			Kullanýcý kullanýcý = new Kullanýcý();
			System.out.println("Lutfen isminizi giriniz");
			kullanýcý.isim = scanner.nextLine();
			kullanýcý.email = emailKontrol();
			kullanýcý.sifre = sifreKontrol();
			kullanýcý.id += 1;
			kullanýcýlar[index] = kullanýcý;
			index++;
			System.out.println("Sifreniz basariyla olusturulmustur.");
		}
	}

	public String emailKontrol() {
		boolean kontrol = true;
		String email;

		do {
			System.out.println("Lutfen emailinizi giriniz");
			email = scanner.nextLine().trim();
			if (email.contains("@") && email.endsWith(".com")) {
				System.out.println("Emailiniz kayit edildi.");
				kontrol = false;

			} else {
				System.out.println("Gecerli bir email giriniz.");
			}

		} while (kontrol);

		return email;

	}

	public String sifreKontrol() {
		boolean kontrol = true;
		String sifre;

		do {
			System.out.println("Lutfen sifrenizi giriniz");
			sifre = scanner.nextLine().trim();
			if (sifre.length() > 4) {
				System.out.println("Sifreniz kayit edildi.");
				kontrol = false;

			} else {
				System.out.println("Gecerli bir sifre giriniz.");
			}

		} while (kontrol);

		return sifre;

	}

	public void girisYap() {
		int hak = 3;
		do {
			System.out.println("Lutfen emailinizi giriniz");
			String email = scanner.nextLine().trim();
			System.out.println("Lutfen sifrenizi giriniz");
			String sifre = scanner.nextLine().trim();
			for (int i = 0; i < kullanýcýlar.length; i++) {
				if (kullanýcýlar[i].email.equals(email) && kullanýcýlar[i].sifre.equals(sifre)) {
					System.out.println("Giris yaptiniz");
					ziyaretciSayisi += 1;
					anaSayfa();

				} else {
					System.out.println("Bilgileriniz hatali.");
					hak--;
					sifreSifirla(hak);
				}
			}

		} while (hak != 0);
	}

	public void sifreSifirla(int hak) {
		if (hak == 0) {
			sifreDegistir();
		}
		System.out.println("Sifrenizi sifirlamak istiyormusunuz?(E/H)");
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("e")) {
			sifreDegistir();
		}
	}

	public void sifreDegistir() {
		System.out.println("Yeni sifre giriniz");
		String yeni_sifre1 = scanner.nextLine();
		System.out.println("Yeni sifreyi tekrar giriniz");
		String yeni_sifre2 = scanner.nextLine();
		if (yeni_sifre1.equals(yeni_sifre2)) {
			System.out.println("Sifreniz basari ile degistirlmistir.");
			kullanýcý.sifre = yeni_sifre1;
		} else {
			System.out.println("Girdiginiz sifreler uyusmamaktadýr. Lutfen tekrar giriniz.");
			sifreDegistir();
		}

	}

	public void anaSayfa() {
		int in = 0;
		do {
			System.out.println("1- Anket olustur");
			System.out.println("1- Anket sil");
			System.out.println("1- Cikis");
			in = scanner.nextInt();
			switch (in) {
			case 1:
				System.out.println("Anket Olusturuldu.");
				break;

			case 2:
				System.out.println("Anket Silindi.");
				break;

			case 3:
				System.out.println("Anketten Cikiliyor.");
				in = 0;
				break;

			}
		} while (in != 0);
	}

}