package com.futbol;

import java.util.Random;

public abstract class Futbolcu implements IOyuncu {
	String ad;
	String soyad;
	int formaNo;
	int dayan�kl�l�k;
	int h�z;
	int pas;
	int sut;
	int yetenek;
	int kararl�l�k;
	int dogalForm;
	int sans;

	public Futbolcu(String ad, String soyad, int formaNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.formaNo = formaNo;
		this.dayan�kl�l�k = random();
		this.h�z = random();
		this.pas = random();
		this.sut = random();
		this.yetenek = random();
		this.kararl�l�k = random();
		this.dogalForm = random();
		this.sans = random();

	}

	public Futbolcu(String ad, String soyad, int formaNo, int dayan�kl�l�k, int h�z, int pas, int sut, int yetenek,
			int kararl�l�k, int dogalForm, int sans) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.formaNo = formaNo;
		this.dayan�kl�l�k = random();
		this.h�z = random();
		this.pas = random();
		this.sut = random();
		this.yetenek = random();
		this.kararl�l�k = random();
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
		return "Futbolcu [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ", dayaniklilik=" + dayan�kl�l�k
				+ ", hiz=" + h�z + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararl�l�k + ", dogalForm=" + dogalForm + ", sans=" + sans + "]";
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

	public int getDayan�kl�l�k() {
		return dayan�kl�l�k;
	}

	public void setDayan�kl�l�k(int dayan�kl�l�k) {
		this.dayan�kl�l�k = dayan�kl�l�k;
	}

	public int getH�z() {
		return h�z;
	}

	public void setH�z(int h�z) {
		this.h�z = h�z;
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

	public int getKararl�l�k() {
		return kararl�l�k;
	}

	public void setKararl�l�k(int kararl�l�k) {
		this.kararl�l�k = kararl�l�k;
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
