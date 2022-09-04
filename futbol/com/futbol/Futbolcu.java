package com.futbol;

import java.util.Random;

public abstract class Futbolcu implements IOyuncu {
	String ad;
	String soyad;
	int formaNo;
	int dayanıklılık;
	int hız;
	int pas;
	int sut;
	int yetenek;
	int kararlılık;
	int dogalForm;
	int sans;

	public Futbolcu(String ad, String soyad, int formaNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.formaNo = formaNo;
		this.dayanıklılık = random();
		this.hız = random();
		this.pas = random();
		this.sut = random();
		this.yetenek = random();
		this.kararlılık = random();
		this.dogalForm = random();
		this.sans = random();

	}

	public Futbolcu(String ad, String soyad, int formaNo, int dayanıklılık, int hız, int pas, int sut, int yetenek,
			int kararlılık, int dogalForm, int sans) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.formaNo = formaNo;
		this.dayanıklılık = random();
		this.hız = random();
		this.pas = random();
		this.sut = random();
		this.yetenek = random();
		this.kararlılık = random();
		this.dogalForm = random();
		this.sans = random();
	}

	public abstract int pasSkor();

	@Override
	public boolean pasVer() {
		int skor = pasSkor();
		if (skor > 65) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Futbolcu [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ", dayaniklilik=" + dayanıklılık
				+ ", hiz=" + hız + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararlılık + ", dogalForm=" + dogalForm + ", sans=" + sans + "]";
	}

	public int random() {
		Random rd = new Random();
		int point = rd.nextInt(50) + 50;
		return point;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getFormaNo() {
		return formaNo;
	}

	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}

	public int getDayanıklılık() {
		return dayanıklılık;
	}

	public void setDayanıklılık(int dayanıklılık) {
		this.dayanıklılık = dayanıklılık;
	}

	public int getHız() {
		return hız;
	}

	public void setHız(int hız) {
		this.hız = hız;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getYetenek() {
		return yetenek;
	}

	public void setYetenek(int yetenek) {
		this.yetenek = yetenek;
	}

	public int getKararlılık() {
		return kararlılık;
	}

	public void setKararlılık(int kararlılık) {
		this.kararlılık = kararlılık;
	}

	public int getDogalForm() {
		return dogalForm;
	}

	public void setDogalForm(int dogalForm) {
		this.dogalForm = dogalForm;
	}

	public int getSans() {
		return sans;
	}

	public void setSans(int sans) {
		this.sans = sans;
	}

}
