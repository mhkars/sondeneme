package com.muhammethoca.Optional;

import java.util.Optional;

public class RunnerOptional {
	static Ogrenci ogr2 = null;

	public static void main(String[] args) {
		Ogrenci ogr = new Ogrenci("Ahmet");
		System.out.println("id...:" + ogr.getId());
		System.out.println("id...:" + ogr.getId());
//		
//		System.out.println("id...:"+ogr2.getId());
//		System.out.println("id...:"+ogr2.getId());

		Optional<Double> ortalama = ortalamaHesapla(90, 65, 78);

		if (ortalama.isPresent()) {
			System.out.println("Ogrencinin ortalamasi..: " + ortalama.get());
		} else {
			System.out.println("Ogrencinin henuz sinav notu yoktur.");
		}

		ortalama.ifPresent(System.out::println);
	}

	public static Optional<Double> ortalamaHesapla(double... notlar) {
		if (notlar.length == 0)
			return Optional.empty();
		double ort = 0;
		for (double not : notlar) {
			ort += not;
		}
		ort = ort / notlar.length;
		return Optional.of(ort);
	}

	public static Optional<Ogrenci> ogrenciOlustur() {
		Ogrenci ogr = null;
		Optional<Ogrenci> optionalOgr = ogr == null ? Optional.empty() : Optional.of(ogr);
		return optionalOgr;
	}
}
