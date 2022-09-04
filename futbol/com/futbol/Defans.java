package com.futbol;

import java.util.Random;

public class Defans extends Futbolcu {

	int pozisyonAlma;
	int kafa;
	int sýcrama;

	public Defans(String ad, String soyad, int formaNo) {
		super(ad, soyad, formaNo);
		this.pozisyonAlma = random();
		this.kafa = random();
		this.sýcrama = random();
	}

	public Defans(String ad, String soyad, int formaNo, int dayanýklýlýk, int hýz, int pas, int sut, int yetenek,
			int kararlýlýk, int dogalForm, int sans, int pozisyonAlma, int kafa, int sýcrama) {
		super(ad, soyad, formaNo, dayanýklýlýk, hýz, pas, sut, yetenek, kararlýlýk, dogalForm, sans);
		this.pozisyonAlma = pozisyonAlma;
		this.kafa = kafa;
		this.sýcrama = sýcrama;
	}

	public boolean pasVer(Defans defans) {
		Random rd = new Random();
		int bonus = rd.nextInt(5);
		double skor = defans.pas * 0.2 + defans.yetenek * 0.2 + defans.dayanýklýlýk * 0.1 + defans.dogalForm * 0.1
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

	public int getSýcrama() {
		return sýcrama;
	}

	public void setSýcrama(int sýcrama) {
		this.sýcrama = sýcrama;
	}

	@Override
	public String toString() {
		return "Defans [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ",  dayaniklilik=" + dayanýklýlýk
				+ ", hiz=" + hýz + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararlýlýk + ", dogalForm=" + dogalForm + ", sans=" + sans + ", pozisyonAlma=" + pozisyonAlma
				+ ", kafa=" + kafa + ", sicrama=" + sýcrama + "]";
	}

	@Override
	public int pasSkor() {
		Random rd = new Random();
		int bonus = rd.nextInt(0, 4);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getDayanýklýlýk() * 0.1 + getDogalForm() * 0.1
				+ getPozisyonAlma() * 0.1 + getSans() * 0.2 + bonus);
		return skor;
	}

}
