package com.bilgeadam.oop.capsulation;

public class Kitap {

	private int sayfaSayisi;
	private String kitapAd�;
	private String yazarAdi;

	public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
		this.kitapAd� = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.sayfaSayisi = sayfaSayisi;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getKitapAd�() {
		return kitapAd�;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

}
