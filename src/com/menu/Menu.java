package com.menu;

public class Menu {
	EYemek yemek;
	ECorba corba;
	EIcecek icecek;
	ETatlý tatlý;

	public Menu() {
		super();
	}

	public Menu(EYemek yemek, ECorba corba, EIcecek icecek, ETatlý tatlý) {
		super();
		this.yemek = yemek;
		this.corba = corba;
		this.icecek = icecek;
		this.tatlý = tatlý;
	}

	public EYemek getYemek() {
		return yemek;
	}

	public void setYemek(EYemek yemek) {
		this.yemek = yemek;
	}

	public ECorba getCorba() {
		return corba;
	}

	public void setCorba(ECorba corba) {
		this.corba = corba;
	}

	public EIcecek getIcecek() {
		return icecek;
	}

	public void setIcecek(EIcecek icecek) {
		this.icecek = icecek;
	}

	public ETatlý getTatlý() {
		return tatlý;
	}

	public void setTatlý(ETatlý tatlý) {
		this.tatlý = tatlý;
	}

	@Override
	public String toString() {
		return "Menu [yemek=" + yemek + ", corba=" + corba + ", icecek=" + icecek + ", tatlý=" + tatlý + "]";
	}

}
