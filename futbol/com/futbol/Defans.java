package com.futbol;

import java.util.Random;

public class Defans extends Futbolcu {

	int pozisyonAlma;
	int kafa;
	int s�crama;

	public Defans(String ad, String soyad, int formaNo) {
		super(ad, soyad, formaNo);
		this.pozisyonAlma = random();
		this.kafa = random();
		this.s�crama = random();
	}

	public Defans(String ad, String soyad, int formaNo, int dayan�kl�l�k, int h�z, int pas, int sut, int yetenek,
			int kararl�l�k, int dogalForm, int sans, int pozisyonAlma, int kafa, int s�crama) {
		super(ad, soyad, formaNo, dayan�kl�l�k, h�z, pas, sut, yetenek, kararl�l�k, dogalForm, sans);
		this.pozisyonAlma = pozisyonAlma;
		this.kafa = kafa;
		this.s�crama = s�crama;
	}

	public boolean pasVer(Defans defans) {
		Random rd = new Random();
		int bonus = rd.nextInt(5);
		double skor = defans.pas * 0.2 + defans.yetenek * 0.2 + defans.dayan�kl�l�k * 0.1 + defans.dogalForm * 0.1
				+ defans.pozisyonAlma * 0.1 + defans.sans * 0.2 + bonus;
		if (skor > 65) {
			return true;
		}
		return false;
	}

	public int random() {
		Random rd = new Random();
		int point = rd.nextInt(30) + 60;
		return point;
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getS�crama() {
		return s�crama;
	}

	public void setS�crama(int s�crama) {
		this.s�crama = s�crama;
	}

	@Override
	public String toString() {
		return "Defans [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ",  dayaniklilik=" + dayan�kl�l�k
				+ ", hiz=" + h�z + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararl�l�k + ", dogalForm=" + dogalForm + ", sans=" + sans + ", pozisyonAlma=" + pozisyonAlma
				+ ", kafa=" + kafa + ", sicrama=" + s�crama + "]";
	}

	@Override
	public int pasSkor() {
		Random rd = new Random();
		int bonus = rd.nextInt(0, 4);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getDayan�kl�l�k() * 0.1 + getDogalForm() * 0.1
				+ getPozisyonAlma() * 0.1 + getSans() * 0.2 + bonus);
		return skor;
	}

}
