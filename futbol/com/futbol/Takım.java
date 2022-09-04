package com.futbol;

import java.util.ArrayList;
import java.util.List;

public class Takým {

	List<Futbolcu> takýmA;
	String isim;

	public Takým(String ad, int a, int b, int c) {
		this.isim = ad;
		this.takýmA = new ArrayList<Futbolcu>();
		forvetOlustur(c);
		ortaSahaOlustur(b);
		defansOlustur(a);
		kaleciOlustur();

	}

	public void defansOlustur(int a) {
		while (a != 0) {
			String ad = "defans";
			String soyad = Integer.toString(a);
			Defans defans = new Defans(ad, soyad, a + 1);
			takýmA.add(defans);
			a--;

		}
	}

	public void ortaSahaOlustur(int b) {
		while (b != 0) {
			String ad = "ortash";
			String soyad = Integer.toString(b);
			OrtaSaha ortaSaha = new OrtaSaha(ad, soyad, b + 5);
			takýmA.add(ortaSaha);
			b--;

		}
	}

	public void forvetOlustur(int c) {
		while (c != 0) {
			String ad = "forvet";
			String soyad = Integer.toString(c);
			Forvet forvet = new Forvet(ad, soyad, c + 9);
			takýmA.add(forvet);
			c--;

		}
	}

	public void kaleciOlustur() {

		String ad = "kaleci";
		String soyad = "1";
		Kaleci kaleci = new Kaleci(ad, soyad, 1);
		takýmA.add(kaleci);

	}

}
