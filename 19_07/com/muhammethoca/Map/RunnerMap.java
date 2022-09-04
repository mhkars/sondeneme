package com.muhammethoca.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunnerMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Bolum> bolumListesi = new ArrayList<Bolum>();
		bolumListesi.add(new Bolum(1, "Bilgi islem"));
		bolumListesi.add(new Bolum(2, "Insan Kaynaklari"));
		bolumListesi.add(new Bolum(3, "Muhasebe"));
		bolumListesi.add(new Bolum(4, "Guvenlik"));

		List<Personel> personelList = new ArrayList<Personel>();

		personelList.add(new Personel(1, "Ahmet", "TAS", "0 555 111 1111", bolumListesi.get(0)));
		personelList.add(new Personel(2, "Canan", "TAS", "0 999 111 1111", bolumListesi.get(0)));
		personelList.add(new Personel(3, "Bahar", "TAS", "0 888 111 1111", bolumListesi.get(0)));
		personelList.add(new Personel(4, "Taner", "BULUS", "0 999 111 1111", bolumListesi.get(1)));
		personelList.add(new Personel(5, "Hakan", "DOK", "0 888 111 1111", bolumListesi.get(1)));
		personelList.add(new Personel(6, "Tuana", "TEK", "0 555 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(7, "Temel", "TAS", "0 999 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(8, "Tahir", "TEK", "0 888 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(9, "Taha", "TAS", "0 555 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(10, "Tunç", "TEK", "0 999 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(11, "Güvenç", "BEKTAS", "0 888 111 1111", bolumListesi.get(2)));

		Map<Bolum, List<Personel>> bolumPersonelListesi;

		bolumPersonelListesi = personelList.stream().collect(Collectors.groupingBy(Personel::getBolum));

		System.out.println("1- Bilgi Islem");
		System.out.println("2- Insan Kaynaklari");
		System.out.println("3- Muhasebe");
		System.out.println("4- Guvenlik");
		System.out.print("Personel listele....: ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt() - 1;
		Bolum bolum = bolumListesi.get(secim);
		List<Personel> secilenBolumPersonelListesi = bolumPersonelListesi.get(bolum);
		secilenBolumPersonelListesi.forEach(x -> System.out.println(x.toString()));

	}
}
