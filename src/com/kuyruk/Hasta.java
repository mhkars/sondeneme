package com.kuyruk;

public class Hasta implements Comparable<Hasta> {

	private String isim;
	private String sikayet;
	private int oncelik;

	public Hasta(String isim, String sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
	}

	@Override
	public String toString() {
		return "Hasta [isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + "]";
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet;
	}

	public void setSikayet(String sikayet) {
		this.sikayet = sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(int oncelik) {
		if (this.sikayet == "Apandist") {
			this.oncelik = 1;

		} else if (this.sikayet == "Yanik") {
			this.oncelik = 2;

		} else {
			this.oncelik = 3;
		}

	}

	@Override
	public int compareTo(Hasta hasta) {

		if (this.oncelik > hasta.oncelik) {
			return 1;

		} else if (this.oncelik > hasta.oncelik) {
			return -1;

		} else {
			return 0;
		}

	}

}
