package com.mustafahoca;

public enum EUrun {
	Cips(20), Kola(15), Seker(60), Yag(200), Un(50), Ekmek(5), Cay(60), Yumurta(14), Yogurt(22), Sut(12);

	int fiyat;

	EUrun(int fiyat) {
		this.fiyat = fiyat;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

}
