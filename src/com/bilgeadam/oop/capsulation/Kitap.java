package com.bilgeadam.oop.capsulation;

public class Kitap {

	private int sayfaSayisi;
	private String kitapAdý;
	private String yazarAdi;

	public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
		this.kitapAdý = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.sayfaSayisi = sayfaSayisi;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getKitapAdý() {
		return kitapAdý;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

}
