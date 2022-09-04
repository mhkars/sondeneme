package com.futbol;

import java.util.Random;

public class OrtaSaha extends Futbolcu {

	int uzunTop;
	int ilkDokunus;
	int topSurme;
	int uretkenlik;
	int ozelYetenek;

	public OrtaSaha(String ad, String soyad, int formaNo) {
		super(ad, soyad, formaNo);
		this.uzunTop = random();
		this.ilkDokunus = random();
		this.topSurme = random();
		this.uretkenlik = random();
		this.ozelYetenek = random();

	}

	public OrtaSaha(String ad, String soyad, int formaNo, int dayan�kl�l�k, int h�z, int pas, int sut, int yetenek,
			int kararl�l�k, int dogalForm, int sans, int uzunTop, int ilkDokunus, int topSurme, int uretkenlik,
			int ozelYetenek) {
		super(ad, soyad, formaNo, dayan�kl�l�k, h�z, pas, sut, yetenek, kararl�l�k, dogalForm, sans);
		this.uzunTop = uzunTop;
		this.ilkDokunus = ilkDokunus;
		this.topSurme = topSurme;
		this.uretkenlik = uretkenlik;
		this.ozelYetenek = ozelYetenek;
	}

	public int random() {
		Random rd = new Random();
		int point = rd.nextInt(40) + 60;
		return point;
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = random();
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = random();
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = random();
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = random();
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = random();
	}

	@Override
	public String toString() {
		return "OrtaSh [ad=" + ad + ", soyad=" + soyad + ", formaNo=" + formaNo + ",  dayaniklilik=" + dayan�kl�l�k
				+ ", hiz=" + h�z + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararl�l�k + ", dogalForm=" + dogalForm + ", sans=" + sans + ", uzunTop=" + uzunTop + ", ilkDokunus="
				+ ilkDokunus + ", topSurme=" + topSurme + ", uretkenlik=" + uretkenlik + ", ozelYetenek=" + ozelYetenek
				+ "]";
	}

	@Override
	public int pasSkor() {
		Random rd = new Random();
		int bonus = rd.nextInt(1, 8);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayan�kl�l�k() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);
		return skor;

	}

}
