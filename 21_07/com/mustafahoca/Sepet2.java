package com.mustafahoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sepet2 {

	EUrun product[] = EUrun.values();
	Map<String, Integer> sepetMap = new HashMap<String, Integer>();
	List<Urun> urunler = new ArrayList<Urun>();
	Map<String, Double> urunMap = new HashMap<String, Double>();

	public Sepet2() {
		urunOlustur();
		urunfiyatMapOlustur();
	}

	public void urunleriListe() {

		urunler.forEach(System.out::println);

	}

	public void toplam() {

		List<Double> fiyatlar = sepetMap.entrySet().stream().map(s -> {

			return urunMap.get(s.getKey()) * s.getValue();

		}).collect(Collectors.toList());

		Double toplam = fiyatlar.stream().reduce((s1, s2) -> s1 + s2).get();
		System.out.println("Sepetin toplamý= " + toplam);

	}

	public void urunOlustur() {

		Arrays.asList(product).stream().forEach((t) -> urunler.add(new Urun(t.name(), t.fiyat)));

	}

	public void urunfiyatMapOlustur() {
		urunMap = urunler.stream().collect(Collectors.toMap(s -> s.getName(), t -> t.getPrice()));

	}

	public void sepetiGoster2() {
		sepetMap.entrySet().forEach(s -> System.out.println(s));

		toplam();

		double result = sepetMap.entrySet().stream().collect(Collectors.averagingDouble(s -> s.getValue()));
		System.out.println(result);
	}

	public void urunekle2() {
		Scanner scanner = new Scanner(System.in);
		String urun = scanner.nextLine();

		if (sepetMap.containsKey(urun)) {

			sepetMap.replace(urun, sepetMap.get(urun) + 1);
			System.out.println(urun + " Sepete eklendi");

		} else {
			if (urunMap.containsKey(urun)) {
				sepetMap.put(urun, 1);
				System.out.println(urun + " Sepete eklendi");
			} else {
				System.out.println("Urun Bulunamadý");
			}
		}

	}

	public static void main(String[] args) {
		Sepet2 sepet = new Sepet2();
//		sepet.fiyatý50denBuyukolanlar();
		sepet.menu();
//		sepet.urunOlustur();
//		sepet.urunfiyatMapOlustur();

	}

	public void menu() {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----------------");
			System.out.println("1-Ürün Listesi Göster");
			System.out.println("2-Ürün Ekle");
			System.out.println("3-Sepeti Göster");
			System.out.println("----------------");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				urunleriListe();
				break;
			case 2:
				urunekle2();
				break;
			case 3:
				sepetiGoster2();
				break;
			case 4:
				fiyatý50denBuyukolanlar();
				break;
			default:
				break;
			}

		} while (input != 0);

	}

	public void fiyatý50denBuyukolanlar() {

		List<Urun> liste = urunler.stream().filter(s -> s.getPrice() > 50).collect(Collectors.toList());
		double result = liste.stream().collect(Collectors.averagingDouble(Urun::getPrice));
		double result2 = liste.stream().collect(Collectors.averagingDouble(s -> s.getPrice()));
		System.out.println(result);
		System.out.println(result2);
	}
}