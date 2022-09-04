package com.futbol;

import java.util.Random;

public class Forvet extends Futbolcu {

	int bitiricilik;
	int ilkDokunus;
	int kafa;
	int ozelYetenek;

	public Forvet(String ad, String soyad, int formaNo) {
		super(ad, soyad, formaNo);
		this.bitiricilik = random();
		this.ilkDokunus = random();
		this.kafa = random();
		this.ozelYetenek = random();
	}

	public Forvet(String ad, String soyad, int formaNo, int dayanýklýlýk, int hýz, int pas, int sut, int yetenek,
			int kararlýlýk, int dogalForm, int sans, int bitiricilik, int ilkDokunus, int kafa, int ozelYetenek) {
		super(ad, soyad, formaNo, dayanýklýlýk, hýz, pas, sut, yetenek, kararlýlýk, dogalForm, sans);
		this.bitiricilik = bitiricilik;
		this.ilkDokunus = ilkDokunus;
		this.kafa = kafa;
		this.ozelYetenek = ozelYetenek;
	}

	public int random() {
		Random rd = new Random();
		int point = rd.nextInt(30) + 70;
		return point;
	}

	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = random();
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = random();
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = random();
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = random();
	}

	@Override
	public String toString() {
		return "Forvet [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ", dayaniklilik=" + dayanýklýlýk
				+ ", hiz=" + hýz + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararlýlýk + ", dogalForm=" + dogalForm + ", sans=" + sans + ", bitiricilik=" + bitiricilik
				+ ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek=" + ozelYetenek + "]";
	}

	@Override
	public int pasSkor() {
		Random rd = new Random();
		int bonus = rd.nextInt(1, 6);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayanýklýlýk() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);

		return skor;
	}

}
