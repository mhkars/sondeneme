package com.menu;

public class Menu {
	EYemek yemek;
	ECorba corba;
	EIcecek icecek;
	ETatl� tatl�;

	public Menu() {
		super();
	}

	public Menu(EYemek yemek, ECorba corba, EIcecek icecek, ETatl� tatl�) {
		super();
		this.yemek = yemek;
		this.corba = corba;
		this.icecek = icecek;
		this.tatl� = tatl�;
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

	public ETatl� getTatl�() {
		return tatl�;
	}

	public void setTatl�(ETatl� tatl�) {
		this.tatl� = tatl�;
	}

	@Override
	public String toString() {
		return "Menu [yemek=" + yemek + ", corba=" + corba + ", icecek=" + icecek + ", tatl�=" + tatl� + "]";
	}

}
