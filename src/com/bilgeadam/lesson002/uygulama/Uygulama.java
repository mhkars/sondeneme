package com.bilgeadam.lesson002.uygulama;

import java.util.Scanner;

public class Uygulama {

	Kullan�c�[] kullan�c�lar = new Kullan�c�[3];
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
		if (kullan�c�lar[kullan�c�lar.length - 1] != null) {
			System.out.println("Uygulama kapasitesi dolu.");
		} else {
			Kullan�c� kullan�c� = new Kullan�c�();
			System.out.println("Lutfen isminizi giriniz");
			kullan�c�.isim = scanner.nextLine();
			kullan�c�.email = emailKontrol();
			kullan�c�.sifre = sifreKontrol();
			kullan�c�.id += 1;
			kullan�c�lar[index] = kullan�c�;
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
			for (int i = 0; i < kullan�c�lar.length; i++) {
				if (kullan�c�lar[i].email.equals(email) && kullan�c�lar[i].sifre.equals(sifre)) {
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
			kullan�c�.sifre = yeni_sifre1;
		} else {
			System.out.println("Girdiginiz sifreler uyusmamaktad�r. Lutfen tekrar giriniz.");
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