package com.mustafahoca.odev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	String durum;
	String bolum;
	String name;
	List<Double> notlar = new ArrayList<>();

	public void ortalanaHesapla() {
		notlar.stream().collect(Collectors.averagingDouble(s -> s));
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", notlar=" + notlar + "]";
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getNotlar() {
		return notlar;
	}

	public void setNotlar(List<Double> notlar) {
		this.notlar = notlar;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
}