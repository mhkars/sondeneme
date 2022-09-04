package com.futbol;

import java.util.Random;

public class Kaleci extends Futbolcu {

	int kurtar�s;

	public Kaleci(String ad, String soyad, int formaNo, int dayan�kl�l�k, int h�z, int pas, int sut, int yetenek,
			int kararl�l�k, int dogalForm, int sans, int kurtar�s) {
		super(ad, soyad, formaNo, dayan�kl�l�k, h�z, pas, sut, yetenek, kararl�l�k, dogalForm, sans);
		this.kurtar�s = kurtar�s;
	}

	public Kaleci(String ad, String soyad, int formaNo) {
		super(ad, soyad, formaNo);
		this.kurtar�s = random();
	}

	public int random() {
		Random rd = new Random();
		int point = rd.nextInt(35) + 65;
		return point;
	}

	public int getKurtar�s() {
		return kurtar�s;
	}

	public void setKurtar�s(int kurtar�s) {
		this.kurtar�s = random();
	}

	@Override
	public String toString() {
		return "Kaleci [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ",  dayaniklilik=" + dayan�kl�l�k
				+ ", hiz=" + h�z + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararl�l�k + ", dogalForm=" + dogalForm + ", sans=" + sans + ", kurtaris=" + kurtar�s + "]";
	}

	@Override
	public int pasSkor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
