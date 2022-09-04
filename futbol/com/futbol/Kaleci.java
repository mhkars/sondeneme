package com.futbol;

import java.util.Random;

public class Kaleci extends Futbolcu {

	int kurtarıs;

	public Kaleci(String ad, String soyad, int formaNo, int dayanıklılık, int hız, int pas, int sut, int yetenek,
			int kararlılık, int dogalForm, int sans, int kurtarıs) {
		super(ad, soyad, formaNo, dayanıklılık, hız, pas, sut, yetenek, kararlılık, dogalForm, sans);
		this.kurtarıs = kurtarıs;
	}

	public Kaleci(String ad, String soyad, int formaNo) {
		super(ad, soyad, formaNo);
		this.kurtarıs = random();
	}

	public int random() {
		Random rd = new Random();
		int point = rd.nextInt(35) + 65;
		return point;
	}

	public int getKurtarıs() {
		return kurtarıs;
	}

	public void setKurtarıs(int kurtarıs) {
		this.kurtarıs = random();
	}

	@Override
	public String toString() {
		return "Kaleci [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ",  dayaniklilik=" + dayanıklılık
				+ ", hiz=" + hız + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararlılık + ", dogalForm=" + dogalForm + ", sans=" + sans + ", kurtaris=" + kurtarıs + "]";
	}

	@Override
	public int pasSkor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
