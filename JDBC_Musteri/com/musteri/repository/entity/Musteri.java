package com.musteri.repository.entity;

public class Musteri {

	private int id;
	private String ad;
	private String soyad;
	private String tel;
	private String adres;
	private int durum;

	public Musteri(int id, String ad, String soyad, String tel, String adres, int durum) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.tel = tel;
		this.adres = adres;
		this.durum = durum;
	}

	public Musteri(String ad, String soyad, String tel, String adres, int durum) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tel = tel;
		this.adres = adres;
		this.durum = durum;
	}

	public Musteri() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getDurum() {
		return durum;
	}

	public void setDurum(int durum) {
		this.durum = durum;
	}

	@Override
	public String toString() {
		return "Musteri [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", tel=" + tel + ", adres=" + adres
				+ ", durum=" + durum + "]";
	}

}
